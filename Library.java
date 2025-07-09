import java.util.Scanner;
public class Library {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // ToDo create some books and users
        Book book1 = new Book("Alaadin",123,"Sherlock",10);
        Book book2 = new Book("Atomic Habits", 222,"Madison",11);
        Book book3 = new Book("Hello world",111,"Ram",20);

        User user1 = new User("Surendra","surendra123",123456789);

        // ToDo show available option
        // Show option: available books, borrow bool, return book, exit
        System.out.println("Welcome to the Library");
        System.out.println("Enter 1: Show available books ");
        System.out.println("Enter 2: Borrow Book ");
        System.out.println("Enter 3: Return Book ");
        System.out.println("Enter 4: Exit ");
        System.out.println("Choose an option: ");

        int option = sc.nextInt();

        if(option == 1){
            System.out.println("Working on viewing available Books");

        } else if (option == 2) {
            System.out.println("Working on borrowing books");
            // ToDo which book to borrow
            // ToDo after borrowing it should show message
            System.out.println("Before"+book1.getQuantity());
            user1.borrowBook(user1,book1);
            System.out.println("After"+book1.getQuantity());

        } else if (option == 3) {
            System.out.println("working on returning books");

        } else if(option == 4) {
            System.out.println(" Working on Exiting");

        }else{
            System.out.println("Invalid option");
        }

        // ToDo need to figure out where to keep the books and users?
    }
}
