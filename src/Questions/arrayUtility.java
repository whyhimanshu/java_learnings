package Questions;
import java.util.*;
//METHODS FOR USING IN PROGRAMS.
public class arrayUtility {
    public static int[] inputArray(){
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
        return arr;
    }
    public static void displayArray(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }
    public static int [][] Input2DArr(){
        System.out.print("Please enter the number of rows in your" +
                " 2d Leacture.array : ");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        System.out.print("Now enter columns: ");
        int columns = input.nextInt();
        int numArr [][]= new int[rows][columns];
        int i=0;
        while(i<rows){
            int j=0;
            while(j<columns){
                System.out.print("Please enter the row "+(i+1)+" Column "+(j+1)+" th element : ");
                numArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;

    }

}
