package com.summer.library.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String bookName;
    private int bookNumber;
    private String bookAuthor;
    private int bookQuantity;

    // No-arg constructor required by JPA
    public Book() {
    }

    // Constructor with all fields except bookId (auto-generated)
    public Book(String bookName, int bookNumber, String bookAuthor, int bookQuantity) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
    }

    // Behaviors
    public void increaseQuantity() {
        this.bookQuantity++;
    }

    public void decreaseQuantity() {
        if (this.bookQuantity > 0) {
            this.bookQuantity--;
        } else {
            throw new IllegalStateException("Book quantity cannot be negative");
        }
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        if (bookQuantity >= 0) {
            this.bookQuantity = bookQuantity;
        } else {
            throw new IllegalArgumentException("Book quantity cannot be negative");
        }
    }
}