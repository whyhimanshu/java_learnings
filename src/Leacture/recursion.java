package Leacture;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial calculator!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        long fac = fac(num);
        System.out.println("Your factorial is "+ fac);
    }

    public static long fac(int num) {
        //*** by loop ***
//        long result =1;
//        for(int i=0;i<=num;i++){
//
//        }
        // *** by Leacture.recursion ***
        if (num == 1 || num == 0) {
            return 1;  // base case for stopping Leacture.recursion
        }
        else {
            return num * fac(num - 1);

        }
    }
}
