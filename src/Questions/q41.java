package Questions;

import java.util.Scanner;

import static java.lang.System.exit;

public class q41 {
    public static void main(String[] args) {
        int[] arr = arrayUtility.inputArray();
        System.out.println("Please enter the number you are searching for: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int occ = occurence(arr, num);
        System.out.println("Entered Number came "+occ+" times!");
    }
    public static int occurence(int []arr,int num){
        int i=0,count=0;
        while(i< arr.length) {
            if (arr[i] == num) {
                count++;
            }
            i++;
        }
        return count;
    }

}
