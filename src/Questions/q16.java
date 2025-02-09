package Questions;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
