package com.summer.library.BookService;

import com.summer.library.BookRepository.BookRepository;
import com.summer.library.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void storeBook(Book book) {
        bookRepository.save(book);
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<>(bookRepository.findAll());
    }

    public void updateBook(int bookId, int bookNumber) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found with ID: " + bookId));
        book.setBookNumber(bookNumber);
        bookRepository.save(book);
    }

    public boolean deleteBook(int bookId) {
        if (bookRepository.existsById(bookId)) {
            bookRepository.deleteById(bookId);
            return true;
        }
        return false;
    }

    public Book getBookInfo(int bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found with ID: " + bookId));
    }
}