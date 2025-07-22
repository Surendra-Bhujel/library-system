package com.summer.library.Models;

public class Record {

    private User user;
    private Book book;
    private String date;
    private boolean isReturned;

    public Record(User user, Book book) {
        this.user = user;
        this.book = book;
        this.date = "date";
        this.isReturned = false;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public String getDate() {
        return date;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
