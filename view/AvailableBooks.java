package view;

import Controller.BookController;
import Models.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AvailableBooks {
    public static void showAvailableBooks(){
        BookController bookController = new BookController();
        ArrayList<Book> bookList = bookController.getBooks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Books: ");
        for (Book book: bookList){
            System.out.println("Book Number: "+book.getBookNumber());
        }
        viewController.getAvailableBooks();
    }
}
