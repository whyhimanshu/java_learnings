package Leacture;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
//        System.out.print("Please enter your age: ");
        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//        while(age < 0 || age > 100){
//            System.out.print("Please enter your age: ");
//            age = input.nextInt();
//        }
        int age;
        do {
            System.out.print("Please enter your age: ");
            age = input.nextInt();
        } while(age<0 || age >100);
        System.out.print("Your age is: "+ age);


    }
}
