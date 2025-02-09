package Leacture;

import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Good Evening, "+ name);
        System.out.print("Now, Enter your age "+name);
        int age = input.nextInt();
        System.out.println("Wow your age is "+age);

    }
}
