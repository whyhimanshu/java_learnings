package Questions;

import java.util.Scanner;

public class q58 {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator! ");
        System.out.print("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Now enter second number: ");;
        int num2 = input.nextInt();
        System.out.print("Now, enter what operation to perform: ");
        String userInput = input.next();
        int result = switch (userInput){
            case "+" -> num1 + num2 ;
            case "-" -> num1 - num2;
            case "/" -> num1 / num2;
            case "*" -> num1 * num2;
            default -> -1;
        };
        System.out.println("Answer for "+ userInput + " is "+ result);

    }
}
