public class User {
    // Attribute -> name, username, contact
    private String name;
    private String userName;
    private int contact;

    public User(String name, String userName, int contact) {
        this.name = name;
        this.userName = userName;
        this.contact = contact;
    }

    // behaviour -> check his registration, borrow, return
    public void isRegistration(){
        System.out.println("Need to work on checking registered");
    }
    public void borrowBook(User user,Book book){
        if(book.getQuantity()>0){
            Record record = new Record(user,book);
            book.decreaseQuantity();

        }else{
            System.out.println("Book not available");
        }
    }
    public void returnBook(){
        System.out.println("need to work on return book");
    }

    public String getName() {
        return name;
    }

    public int getContact() {
        return contact;
    }
    public String getUserName(){
        return userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
