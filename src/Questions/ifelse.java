package Questions;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("Enter you age :");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age>=18){
            System.out.println("You are eligible for license.");
        }
        else{
            System.out.println("Not eligible.");
        }
    }
}
