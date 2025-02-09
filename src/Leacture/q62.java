package Leacture;

import java.util.Scanner;

public class q62 {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Checker!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num) ? "Prime" : "Not Prime" ));
    }
    public static boolean isPrime(int num){
        if (num ==1){
            return false;
        }
        for ( int i =2 ; i<num ; i++){
            if ( num % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
