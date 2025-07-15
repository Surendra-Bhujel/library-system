import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // ToDo create some books and users
        Book book1 = new Book("Alaadin",123,"Sherlock",10);
        Book book2 = new Book("Atomic Habits", 222,"Madison",11);
        Book book3 = new Book("Hello world",111,"Ram",20);

        // Insert Book into database
        try{
            Connection conn = DatabaseConnection.connect();
            String query =  "INSERT INTO book"+
                    "(BookName, BookNumber, AuthorName, Quantity) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,book1.getBookName());
            ps.setInt(2,book1.getBookNumber());
            ps.setString(3,book1.getAuthorName());
            ps.setInt(4,book1.getQuantity());

            if(ps.executeUpdate() >0){
                System.out.println("Book 1 added to database.");
            }else {
                System.out.println("Failed to add Book 1.");
            }
            // Add Book 2 and Book 3 similarly
            ps.setString(1,book2.getBookName());
            ps.setInt(2,book2.getBookNumber());
            ps.setString(3,book2.getAuthorName());
            ps.setInt(4,book2.getQuantity());

            if(ps.executeUpdate()>0){
                System.out.println("Book 2 added to database.");
            }else {
                System.out.println("Failed to add Book 2.");
            }

            ps.setString(1, book3.getBookName());
            ps.setInt(2, book3.getBookNumber());
            ps.setString(3, book3.getAuthorName());
            ps.setInt(4, book3.getQuantity());

            if (ps.executeUpdate() > 0) {
                System.out.println("Book 3 added to database.");
            }else {
                System.out.println("Failed to add Book 3.");
            }

            conn.close();

        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        // Insert user into database
        User user1 = new User("Surendra","surendra123",123456789);
        try{
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO user"+ "(name, userName, contact) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,user1.getName());
            ps.setString(2,user1.getUserName());
            ps.setInt(3,user1.getContact());

            if(ps.executeUpdate() >0){
                System.out.println("User added to database.");
            }else {
                System.out.println("Failed to add user.");
            }

        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }



        // ToDo show available option
        // Show option: available books, borrow bool, return book, exit
        System.out.println("Welcome to the Library");
        System.out.println("Enter 1: Show available books ");
        System.out.println("Enter 2: Borrow Book ");
        System.out.println("Enter 3: Return Book ");
        System.out.println("Enter 4: Update Book ");
        System.out.println("Enter 5: Delete Book ");
        System.out.println("Enter 6: Exit ");
        System.out.println("Choose an option: ");

        int option = sc.nextInt();

        if(option == 1){
            System.out.println("Available Books");
            try{
                Connection conn = DatabaseConnection.connect();
                ArrayList<Book> bookList = new ArrayList<>();
                String query = "SELECT BookName, BookNumber, AuthorName, Quantity from book";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet bookSet = ps.executeQuery();
                while (bookSet.next()){
                    int bookNumber = bookSet.getInt("bookNumber");
                    String BookName = bookSet.getString("bookName");
                    String AuthorName = bookSet.getString("AuthorName");
                    int Quantity = bookSet.getInt("quantity");

                    Book book = new Book(bookSet.getString("bookname"),
                            bookSet.getInt("bookNumber"),
                            bookSet.getString("bookAuthor"),
                            bookSet.getInt("quantity"));

                    bookList.add(book);
                }
                for (Book book : bookList){
                    System.out.println("book Number: " + book.getBookNumber());
                    System.out.println("book Name: " +book.getBookName());
                    System.out.println("book Author: " +book.getAuthorName());
                    System.out.println("book Quantity: " +book.getQuantity());
                }
                conn.close();
            }catch (SQLException | ClassNotFoundException e){
                throw new RuntimeException(e);
            }
        } else if (option == 2) {
            System.out.println("Working on borrowing books");
            // ToDo which book to borrow
            // ToDo after borrowing it should show message
            System.out.println("Before "+book1.getQuantity());
            user1.borrowBook(user1,book1);
            System.out.println("After  "+book1.getQuantity());

        } else if (option == 3) {
            System.out.println("working on returning books");

        } else if(option == 4) {

            System.out.println("Enter book id: ");
            int bookid = sc.nextInt();
            System.out.println("Enter book Number: ");
            int bookNumber = sc.nextInt();
            try{
                Connection conn = DatabaseConnection.connect();
                String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,bookNumber);
                ps.setInt(2,bookid);
                if(ps.executeUpdate()>0){
                    System.out.println("Book updated");
                }else{
                    System.out.println("Failed to update");
                }
            }
            catch (SQLException | ClassNotFoundException e){
                throw new RuntimeException(e);
            }

        }else if (option == 5){
            System.out.println("Enter the book id to delete.");
            int bookid = sc.nextInt();
            try{
                Connection conn = DatabaseConnection.connect();
                String query = "DELETE FROM book WHERE bookid = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,bookid);
                if(ps.executeUpdate()>0){
                    System.out.println("Book deleted");
                }else{
                    System.out.println("Failed to delete");
                }
            }
            catch (SQLException | ClassNotFoundException e){
                throw new RuntimeException(e);
            }

        }

        // ToDo need to figure out where to keep the books and users?
    }
}
