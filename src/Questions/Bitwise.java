package Questions;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        System.out.print("Please enter Number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1&num2);

    }
}
