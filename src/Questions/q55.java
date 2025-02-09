package Questions;

import java.util.Scanner;

public class q55 {
    public static void main(String[] args) {
        System.out.println("Welcome to calculate absolute value !");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = input.nextInt();
        int result = a<0?-a:a;
        System.out.println("Absolute value of entered number is "+result);
    }
}
