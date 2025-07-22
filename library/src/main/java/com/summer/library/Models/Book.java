package com.summer.library.Models;

public class Book {
    // Books attributes -> book number, nam, quantity, author
    // To Do create attributes

    private String bookName;
    private int bookNumber;
    private String bookAuthor;
    private int bookQuantity;

    public Book(String bookName,int bookNumber,String bookAuthor, int bookQuantity){
        this.bookName=bookName;
        this.bookNumber=bookNumber;
        this.bookAuthor=bookAuthor;
        this.bookQuantity=bookQuantity;

    }

    //Behaviour -> increase quantity, decrease quantity

    public void increaseQuantity(){
        this.bookQuantity++;
    }

    public void decreaseQuantity(){
       this.bookQuantity--;
    }

    public String getBookName(){
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
    public String getAuthorName(){
        return bookAuthor;
    }

    public void setAuthorName(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getQuantity() {
        return bookQuantity;
    }

    public void setQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
