package Questions;

import java.util.Scanner;

public class q61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want table for: ");
        int num = input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = "+ num*i);
        }
    }
}
