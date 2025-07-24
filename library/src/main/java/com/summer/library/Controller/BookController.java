package com.summer.library.Controller;

import com.summer.library.Models.Book;
import com.summer.library.BookService.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/storeBook")
    public void storeBook(@RequestBody Book book) {
        bookService.storeBook(book);
    }

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookService.getBooks();
    }

    @PutMapping("/updateBook")
    public void updateBook(@RequestParam int bookid, @RequestParam int bookNumber) {
        bookService.updateBook(bookid, bookNumber);
    }

    @DeleteMapping("/{bookid}")
    public String deleteBook(@PathVariable int bookid) {
        if (bookService.deleteBook(bookid)) {
            return "deleted";
        } else {
            return "Failed to delete";
        }
    }

    @GetMapping("/book/{bookid}")
    public Book getinfo(@PathVariable int bookid) {
        return bookService.getBookInfo(bookid);
    }
}