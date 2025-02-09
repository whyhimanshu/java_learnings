package Questions;

import java.util.Scanner;

public class q64 {
    public static void main(String[] args) {
        System.out.println("wElcome to Leacture.array occurence finder!!");
        Scanner input = new Scanner(System.in);
        int [] arr = arrayUtility.inputArray();
        System.out.print("Enter the element for fining the occurence of :");
        int num = input.nextInt();
        int count = 0;
        for (int numToFind : arr){
            if ( numToFind == num){
                count++;
            }
        }
        System.out.println("Occurrences of "+ num + " are "+count + " times! ");
    }
}
