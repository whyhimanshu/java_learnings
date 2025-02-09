package Questions.q80;

public class LibraryItem {
    private String itemID;
    private String title;
    private String author;

//    public LibraryItem() {
//        this.itemID = "0";
//        this.title = "NA";
//        this.author = "NA";
//    }
//    public LibraryItem(String itemID, String title, String author) {
//        this.itemID = itemID;
//        this.title = title;
//        this.author = author;
//    }

    public void checkout(){
        System.out.println("Checkout");
    }
    public void returnBook(){
        System.out.println("Returned");
    }
}
