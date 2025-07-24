package com.summer.library.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;
    private String userName;
    private String contact;
    private boolean isRegistered;

    // No-arg constructor required by JPA
    public User() {
    }

    public User(String name, String userName, String contact) {
        this.name = name;
        this.userName = userName;
        this.contact = contact;
        this.isRegistered = false;
    }

    // Behaviors
    public boolean isRegistration() {
        return isRegistered;
    }

    public void setRegistration(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public void borrowBook(User user, Book book) {
        if (!isRegistered) {
            throw new IllegalStateException("User is not registered");
        }
        if (book.getBookQuantity() > 0) {
            // TODO: Create and save a Record entity to track borrowing (requires RecordRepository)
            // Record record = new Record(user, book);
            book.decreaseQuantity();
        } else {
            throw new IllegalStateException("Book not available");
        }
    }

    public void returnBook(Book book) {
        // TODO: Update the corresponding Record entity to mark the book as returned (requires RecordRepository)
        book.increaseQuantity();
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}