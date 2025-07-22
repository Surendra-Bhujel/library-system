package view;

import Controller.BookController;
import Models.Book;

import java.util.Scanner;

public class AddBookView {
    public static void showAddBookView(){
        BookController bookController = new BookController();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book name: ");
        String bookName = sc.nextLine();
        System.out.println("Enter book number: ");
        int bookNumber = sc.nextInt();
        System.out.println("Enter author name: ");
        String authorName = sc.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        Book book = new Book(bookName,bookNumber,authorName,quantity);
        bookController.storeBook(book);
    }
}
