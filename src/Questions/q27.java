package Questions;
//For this program first understand table of binary from 0 to 15.
import java.util.Scanner;

public class q27 {
    /**
     * Hi I am a comment
     * so fuck off
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if((num&1)==1){
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even Number");
        }
    }
}
