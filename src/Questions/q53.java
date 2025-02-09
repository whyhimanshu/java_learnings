package Questions;

import java.util.Scanner;

public class q53 {
    public static void main(String[] args) {
        System.out.println("Welcome to Number small teller !");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Now, enter second number: ");
        int b = input.nextInt();
        q53 minNum = new q53(); // we have to create a object as minTernary is non static
        // method
//        int minNum = minTernary(a,b); // wrong statement
        System.out.println("Minimum number is "+minNum.minTernary(a,b));
    }
    int minTernary(int a,int b){
        return a < b ? a : b;
    }
}