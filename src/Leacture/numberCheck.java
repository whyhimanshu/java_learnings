package Leacture;

import java.util.Scanner;

public class numberCheck {
    public static void main(String[] args) {
        int[] arr = {2, 35, 38, 32, 55};
        System.out.print("Enter the number you want to search for: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean a = isFound(arr, num);
        if (a) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }

        return false;
    }
}
