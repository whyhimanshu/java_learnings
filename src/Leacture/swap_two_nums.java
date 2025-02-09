package Leacture;

import java.util.Scanner;

public class swap_two_nums {
    public static void main(String[] args) {
        int a,b;
        int c;
        System.out.println("Enter the numbers to swap :");
        Scanner input = new Scanner(System.in);
        a= input.nextInt();
        b = input.nextInt();
        c=a;
        a=b;
        b=c;




        System.out.println("After Swapping a= "+a+" b="+b);

    }
}
