package Controller;

import DAO.bookDAO;
import Models.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookController {
    bookDAO bookdao = new bookDAO();

    public void storeBook(Book book){
        bookdao.insertBook(book);
    }
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
