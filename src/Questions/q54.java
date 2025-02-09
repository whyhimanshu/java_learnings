package Questions;

import java.util.Scanner;

public class q54 {
    public static void main(String[] args) {
        System.out.println("Welcome to even odd !");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = input.nextInt();
        String result = a%2==0 ? "Even" : "Odd";
        System.out.println("number IS : "+result);
    }
}
