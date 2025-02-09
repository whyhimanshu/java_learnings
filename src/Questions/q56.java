package Questions;

import java.util.Scanner;

public class q56 {
    public static void main(String[] args) {
        System.out.println("aaja beta marks likh chal!!");
        System.out.println("Chl total likh apna: ");
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        String result = marks>80 ? "High" : (marks>50 ? "Moderate" : "Low");
        System.out.println("To beta teri grade hai "+result);
    }
}
