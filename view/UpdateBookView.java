package view;

import Controller.BookController;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class UpdateBookView {
    public static void showUpdateBookView(){
        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter bookid: ");
        int bookId = sc.nextInt();
        System.out.println("Enter new book number: ");
        int bookNumber = sc.nextInt();
        sc.nextLine();

        bookController.updateBook(bookId,bookNumber);
        MenuView.showMenuView();
    }
}
