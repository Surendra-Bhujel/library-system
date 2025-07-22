package view;

import java.util.Scanner;

public class MenuView {
    public static void showMenuView() {
        Scanner sc = new Scanner(System.in);
        // Show option: available books, borrow bool, return book, exit
        while (true) {
        System.out.println("Welcome to the Library");
        System.out.println("Enter 1: Add a new Book ");
        System.out.println("Enter 2: View Available Books ");
        System.out.println("Enter 3: Borrow Book ");
        System.out.println("Enter 4: Update Book ");
        System.out.println("Enter 5: Delete Book ");
        System.out.println("Enter 6: Exit ");
        System.out.println("Choose an option: ");

        int option = sc.nextInt();
        sc.nextLine();

            if (option == 1) {
                viewController.getAddBookView();
            } else if (option == 2) {
                viewController.getAvailableBooks();
            } else if (option == 3) {
                viewController.getBorrowBookView();
            } else if (option == 4) {
                viewController.getUpdateBookView();
            } else if (option == 5) {
                viewController.getDeleteBookView();
            } else if (option == 6) {
                System.out.println("Exiting the Library System. GoodBye! ");
                break;
            }else {
                System.out.println("Invalid option. Please enter a number between 1 and 6.");
            }
        }
    }
}
