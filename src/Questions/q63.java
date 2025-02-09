package Questions;

import java.util.Scanner;

public class q63 {
    public static void main(String[] args) {
        System.out.println("Welcome to Max element finder!!");
        Scanner input = new Scanner(System.in);
        int[] arr = arrayUtility.inputArray();
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if ( max < num){
                max = num;
            }
        }
        System.out.println("Maximum element is "+max);
    }
}
