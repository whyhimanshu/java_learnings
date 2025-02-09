package Questions;

import java.util.Scanner;

public class q73 {
    public static void main(String[] args) {
        double outcome;
        int choice;
        System.out.println("Welcome to dice-roll!!");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter choice: 1 for roll and 2 for exit: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Rolling the dice...");

                    outcome = 1 + (int) (Math.random() * 6);
                    System.out.println("Dice shown "+outcome);
                    break;
                case 2:
                    System.out.println("exited");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
