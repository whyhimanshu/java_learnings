package Questions;

import java.util.Scanner;

public class q68 {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Recursion");
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of elements to be printed: ");
        int count = input.nextInt();
        for (int i=1; i<=count; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int position){
        // base case
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fibonacci(position-1)+fibonacci(position-2);
    }
}
