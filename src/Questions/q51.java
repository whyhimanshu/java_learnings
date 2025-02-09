package Questions;

public class q51 {
    public static void main(String[] args) {
        Book1 AtomicHabits = new Book1("2035IFS","James Clear",
                "Atomic Habits");
        Book1 Secret = new Book1("IN24520"); //using second constructor
        System.out.println(Book1.getTotalNoOfBooks()); /*calling static method by
        classname.method */
        AtomicHabits.borrowBook();
        Secret.borrowBook();
        AtomicHabits.borrowBook();
        AtomicHabits.returnBook();
        AtomicHabits.returnBook();

    }

}
class Book1{
    String isbn;
    String author;
    String title;
    boolean isBorrowed;
    static int totalNoOfBooks;
    static { //STATIC BLOCK (init with class load)
        totalNoOfBooks=0;
    }
    {
        //Code Block (init when an object is created)
        totalNoOfBooks++;
    }
    Book1(String isbn, String author, String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
    Book1(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed, Sorry.");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy the "+this.title);
        }
    }
    void returnBook() {
        if (isBorrowed){
            this.isBorrowed = false; //false the is borrowed
            System.out.println("Hope you enjoyed the book.");
        }
        else {
            System.out.println("Cant return, as book is already in library.");
        }
    }

}
