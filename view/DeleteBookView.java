package view;

import Controller.BookController;

import java.util.Scanner;

public class DeleteBookView {
    public static void showDeleteBookView(){
        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter the bookid to delete: ");
        int bookid = sc.nextInt();
        bookController.deleteBook(bookid);
    }
}
