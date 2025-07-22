package Controller;

import view.AddBookView;
import view.AvailableBooks;
import view.DeleteBookView;
import view.UpdateBookView;

public class viewController {
    public static void getAddBookView(){
        AddBookView.showAddBookView();
    }
    public static void getAvailableBooks(){
        AvailableBooks.showAvailableBooks();
    }
    public static void getBorrowBookView(){

    }
    public static void getUpdateBookView(){
        UpdateBookView.showUpdateBookView();
    }
    public static void getDeleteBookView(){
        DeleteBookView.showDeleteBookView();
    }
}
