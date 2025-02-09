package Leacture;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        int a= getSum();
        System.out.println("sum is " + a);

    }
    public static int getSum(){
        int a,b;
        System.out.print("Enter a : ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.print("Enter b : ");
        b= input.nextInt();
        return a+b;
    }
}
