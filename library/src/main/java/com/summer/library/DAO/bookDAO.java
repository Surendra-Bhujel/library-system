package com.summer.library.DAO;
import com.summer.library.Models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class bookDAO {
    private Connection conn;

    public void BookDAO() throws SQLException, ClassNotFoundException {
        this.conn = DatabaseConnection.connect();
    }

    public void insertBook(Book book) {
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO book" +
                    "(BookName, BookNumber, AuthorName, Quantity) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, book.getBookName());
            ps.setInt(2, book.getBookNumber());
            ps.setString(3, book.getAuthorName());
            ps.setInt(4, book.getQuantity());

            if (ps.executeUpdate() > 0) {
                System.out.println("Book  added to database.");
            } else {
                System.out.println("Failed to add Book.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateBookDetail(int bookid, int bookNumber) {
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookNumber);
            ps.setInt(2, bookid);
            if (ps.executeUpdate() > 0) {
                System.out.println("book updated");
            } else {
                System.out.println("Failed to update");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteBookDetail(int bookid) {
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "DELETE FROM book WHERE bookId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookid);
            if (ps.executeUpdate() > 0) {
                System.out.println("Book Deleted.");
            } else {
                System.out.println("Failed to delete Book.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    public ArrayList<Book> getBooks() {
        ArrayList<Book> bookList = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "SELECT BookName, BookNumber, AuthorName, Quantity from book";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet bookSet = ps.executeQuery();
            while (bookSet.next()) {
                Book book = new Book(
                        bookSet.getString("bookName"),
                        bookSet.getInt("bookNumber"),
                        bookSet.getString("AuthorName"),
                        bookSet.getInt("quantity"));
                bookList.add(book);
            }
            return bookList;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Book getBookInfo(int bookid) {
        try (PreparedStatement ps = conn.prepareStatement(
                "SELECT BookName, BookNumber, AuthorName, Quantity FROM book WHERE bookId = ?")) {
            ps.setInt(1, bookid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Book(
                        rs.getString("BookName"),
                        rs.getInt("BookNumber"),
                        rs.getString("AuthorName"),
                        rs.getInt("Quantity")
                );
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
