package Questions;
import java.util.*;

public class q51self {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.borrowBook();
        b1.returnBook();
        b1.getTotalBooks();
    }


}
class Book{
    String title;
    String author;
    String isbn;
    static int totalBooks ;
    Scanner input = new Scanner(System.in);
    public void borrowBook(){
        System.out.print("Enter the title of the book you want to borrow: ");
        title = input.nextLine();
        totalBooks--;
        System.out.println("You have been alloted book successfully.");
    }
    public void returnBook(){
        System.out.print("Enter title you want to return: ");
        title = input.nextLine();
        totalBooks++;
        System.out.println("You have returned book successfully.");
    }
    public static void getTotalBooks(){
        System.out.println("The number of total books are "+totalBooks);
    }

}
