public class Book {
    // Books attributes -> book number, nam, quantity, author
    // To Do create attributes


    private String bookName;
    private int bookNumber;
    private String authorName;
    private int quantity;

    public Book(String bookName,int bookNo,String Bookauthor, int quant){
        this.bookName=bookName;
        this.bookNumber=bookNo;
        this.authorName=Bookauthor;
        this.quantity=quant;

    }

    //Behaviour -> increase quantity, decrease quantity

    public void increaseQuantity(){
        System.out.println("need to work to increase.");
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
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
