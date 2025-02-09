package Questions;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Checking....");
        if (num > 0) {
            System.out.println("The number is positive");
        }
        else if(num==0){
            System.out.println("The number is zero.");
        }
        else{
            System.out.println("The entered number is negative");

        }

    }
}
