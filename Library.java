import view.MenuView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    public static void main(String[]args){
        MenuView.showMenuView();
//        Scanner sc = new Scanner(System.in);
//        // ToDo create some books and users
//        Models.Book book1 = new Models.Book("Alaadin",123,"Sherlock",10);
//        Models.Book book2 = new Models.Book("Atomic Habits", 222,"Madison",11);
//        Models.Book book3 = new Models.Book("Hello world",111,"Ram",20);
//
//        // Insert Models.Book into database
//        try{
//            Connection conn = DAO.DatabaseConnection.connect();
//            String query =  "INSERT INTO book"+
//                    "(BookName, BookNumber, AuthorName, Quantity) VALUES (?,?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1,book1.getBookName());
//            ps.setInt(2,book1.getBookNumber());
//            ps.setString(3,book1.getAuthorName());
//            ps.setInt(4,book1.getQuantity());
//
//            if(ps.executeUpdate() >0){
//                System.out.println("Models.Book 1 added to database.");
//            }else {
//                System.out.println("Failed to add Models.Book 1.");
//            }
//            // Add Models.Book 2 and Models.Book 3 similarly
//            ps.setString(1,book2.getBookName());
//            ps.setInt(2,book2.getBookNumber());
//            ps.setString(3,book2.getAuthorName());
//            ps.setInt(4,book2.getQuantity());
//
//            if(ps.executeUpdate()>0){
//                System.out.println("Models.Book 2 added to database.");
//            }else {
//                System.out.println("Failed to add Models.Book 2.");
//            }
//
//            ps.setString(1, book3.getBookName());
//            ps.setInt(2, book3.getBookNumber());
//            ps.setString(3, book3.getAuthorName());
//            ps.setInt(4, book3.getQuantity());
//
//            if (ps.executeUpdate() > 0) {
//                System.out.println("Models.Book 3 added to database.");
//            }else {
//                System.out.println("Failed to add Models.Book 3.");
//            }
//
//            conn.close();
//
//        }catch (SQLException | ClassNotFoundException e){
//            throw new RuntimeException(e);
//        }
//
//        // Insert user into database
//        Models.User user1 = new Models.User("Surendra","surendra123",123456789);
//        try{
//            Connection conn = DAO.DatabaseConnection.connect();
//            String query = "INSERT INTO user"+ "(name, userName, contact) VALUES (?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1,user1.getName());
//            ps.setString(2,user1.getUserName());
//            ps.setInt(3,user1.getContact());
//
//            if(ps.executeUpdate() >0){
//                System.out.println("Models.User added to database.");
//            }else {
//                System.out.println("Failed to add user.");
//
//
//        }catch (SQLException | ClassNotFoundException e){
//            throw new RuntimeException(e);
//        }
//
//
//
//        if(option == 1){
//            System.out.println("Available Books");
//            try{
//                Connection conn = DAO.DatabaseConnection.connect();
//                ArrayList<Models.Book> bookList = new ArrayList<>();
//                String query = "SELECT BookName, BookNumber, AuthorName, Quantity from book";
//                PreparedStatement ps = conn.prepareStatement(query);
//                ResultSet bookSet = ps.executeQuery();
//                while (bookSet.next()){
//                    int bookNumber = bookSet.getInt("bookNumber");
//                    String BookName = bookSet.getString("bookName");
//                    String AuthorName = bookSet.getString("AuthorName");
//                     int Quantity = bookSet.getInt("quantity");
//
//                    Models.Book book = new Models.Book(bookSet.getString("bookname"),
//                            bookSet.getInt("bookNumber"),
//                            bookSet.getString("bookAuthor"),
//                            bookSet.getInt("quantity"));
//
//                    bookList.add(book);
//                }
//                for (Models.Book book : bookList){
//                    System.out.println("book Number: " +book.getBookNumber());
//                    System.out.println("book Name: " +book.getBookName());
//                    System.out.println("book Author: " +book.getAuthorName());
//                    System.out.println("book Quantity: " +book.getQuantity());
//                }
//                conn.close();
//            }catch (SQLException | ClassNotFoundException e){
//                throw new RuntimeException(e);
//            }
//        } else if (option == 2) {
//            System.out.println("Working on borrowing books");
//            // ToDo which book to borrow
//            // ToDo after borrowing it should show message
//            System.out.println("Before "+book1.getQuantity());
//            user1.borrowBook(user1,book1);
//            System.out.println("After  "+book1.getQuantity());
//
//        } else if (option == 3) {
//            System.out.println("working on returning books");
//
//        } else if(option == 4) {
//
//            System.out.println("Enter book id: ");
//            int bookid = sc.nextInt();
//            System.out.println("Enter book Number: ");
//            int bookNumber = sc.nextInt();
//            try{
//                Connection conn = DAO.DatabaseConnection.connect();
//                String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
//                PreparedStatement ps = conn.prepareStatement(query);
//                ps.setInt(1,bookNumber);
//                ps.setInt(2,bookid);
//                if(ps.executeUpdate()>0){
//                    System.out.println("Models.Book updated");
//                }else{
//                    System.out.println("Failed to update");
//                }
//            }
//            catch (SQLException | ClassNotFoundException e){
//                throw new RuntimeException(e);
//            }
//
//        }else if (option == 5){
//            System.out.println("Enter the book id to delete.");
//            int bookid = sc.nextInt();
//            try{
//                Connection conn = DAO.DatabaseConnection.connect();
//                String query = "DELETE FROM book WHERE bookid = ?";
//                PreparedStatement ps = conn.prepareStatement(query);
//                ps.setInt(1,bookid);
//                if(ps.executeUpdate()>0){
//                    System.out.println("Models.Book deleted");
//                }else{
//                    System.out.println("Failed to delete");
//                }
//            }
//            catch (SQLException | ClassNotFoundException e){
//                throw new RuntimeException(e);
//            }
//
//        }
    }
}
