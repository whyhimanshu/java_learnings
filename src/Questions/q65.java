package Questions;

import java.util.Scanner;

public class q65 {
    public static void main(String[] args) {
        System.out.println("Welcome to CMD");
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter command: ");
            String command = input.next();
            if ( command.equalsIgnoreCase("exit")){
                //equalsIgrnoreCase allows to input small or capital letters in exit
                break;
            }
        }
        System.out.println("You exited !!");
    }
}
