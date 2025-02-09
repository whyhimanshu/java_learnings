package Leacture.exception;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers to divide: ");
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            System.out.println("The division is "+(a/b));
        } catch (ArithmeticException e1){
            System.out.println("Not divided by 0");
        } catch (Throwable t1) {
            System.out.println("Exception");
        }
    }
}
