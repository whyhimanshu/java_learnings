package Leacture;

import java.util.Scanner;

public class ternery_operator {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();
        int bigNum = a>b?a : b;
        System.out.println("Big number is "+bigNum);

    }
}
