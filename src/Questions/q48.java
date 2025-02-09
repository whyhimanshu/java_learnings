package Questions;

import java.util.Scanner;

public class q48 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array Searcher tool !");
        int Arr2d[][] = arrayUtility.Input2DArr();
        Scanner input = new Scanner(System.in);
        System.out.print("Now enter number you want to check : ");
        int num = input.nextInt();
        boolean checkNum = numCount(Arr2d, num);
        if (checkNum) {
            System.out.println("Number Found");
        }
        else {
            System.out.println("Not Found");
        }

    }

    public static boolean numCount(int Arr2d[][], int num) {
        int i = 0;
        //int j = 0;
        while (i < Arr2d.length) {
            int j=0;
            while (j < Arr2d[i].length) {
                if (Arr2d[i][j]== num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
