package Questions;

import java.util.Scanner;

public class q44 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Deletion !!\n");
        Scanner input = new Scanner(System.in);
        int[] arr = arrayUtility.inputArray();
        System.out.print("Enter the number you want to delete in Leacture.array: ");
        int num=input.nextInt();
        int[] newArr = deleteNumber(arr,num);
        System.out.println("Voila! Here is your new Leacture.array\n");
        arrayUtility.displayArray(newArr);
        
    }
    public static int[] deleteNumber(int[] arr,int numToDelete){
        int occ = q41.occurence(arr,numToDelete);
        if(occ==0){
            return arr;
        }
        int newSize = arr.length - occ;
        int [] newArr = new int[newSize];
        int i = 0,j=0;
        while(i<arr.length){
            if(arr[i]!=numToDelete){
                newArr[j]=arr[i];
                j++;
            }
            i++;
        }

        return newArr;


    }
}
