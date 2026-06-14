package com.george.booktracker;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book book) {
        Optional<Book> existing = bookRepository.findById(id);
        if (existing.isPresent()) {
            Book existingBook = existing.get();
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setGenre(book.getGenre());
            existingBook.setStatus(book.getStatus());
            existingBook.setReview(book.getReview());
            existingBook.setRating(book.getRating());
            return bookRepository.save(existingBook);
        }
        throw new BookNotFoundException("Book not found");
    }

    public void deleteBook(Long id) {
        Optional<Book> existing = bookRepository.findById(id);
        if (existing.isPresent()) {
            bookRepository.deleteById(id);
        } else {
            throw new BookNotFoundException("Book not found");
        }
    }
}
