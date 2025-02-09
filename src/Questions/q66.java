package Questions;

import java.util.Scanner;

public class q66 {
    public static void main(String[] args) {
        System.out.println("Welcome to positive number adder!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of outcomes: ");
        int n = input.nextInt();
        int sum =0;
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Number :");
            int num = input.nextInt();
            if(num<0){
                System.out.println("Step skipped as number entered is negative.");
                continue;
            }
            sum = sum+num;
        }
        System.out.println("The sum is "+sum);
    }
}
