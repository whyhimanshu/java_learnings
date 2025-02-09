package leetcode;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        System.out.println("Welcome to two sum!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while (i<size){
            System.out.print("Please enter "+(i+1)+" element: ");
            arr[i]= input.nextInt();
            i++;
        }
        System.out.print("Enter target: ");
        int target = input.nextInt();
        int [] twoSumArr = twoSum(arr,target);
        for (int j=0;j<twoSumArr.length;j++){
            System.out.print(twoSumArr[j]+" ");
        }
        System.out.println();
    }
    public static int[] twoSum(int[] arr, int target) {
        // Check each pair of elements to find two numbers that add up to the target
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    // Return indices of the two numbers that add up to the target
                    return new int[] { i, j };
                }
            }
        }

        // Return null if no solution is found
        return null;
    }
}
