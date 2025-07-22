package com.summer.library.Controller;

import com.summer.library.DAO.bookDAO;
import com.summer.library.Models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class BookController {
    bookDAO bookdao = new bookDAO();

    @PostMapping
    public void storeBook(@RequestBody Book book){
        bookdao.insertBook(book);
    }
    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
       return bookdao.getBooks();
    }
    public void updateBook(int bookid, int bookNumber){
        bookdao.updateBookDetail(bookid, bookNumber);
    }
    public void deleteBook(int bookid){
        bookdao.deleteBookDetail(bookid);
    }
}
