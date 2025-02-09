package Questions;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        double cel,fah;
        System.out.println("Welcome to Fahrenheit to Celsius Conversion \n");
        System.out.println("Please enter the value in Fahrenheit: \n");
        Scanner input = new Scanner(System.in);
        fah = input.nextDouble();
        System.out.println("After converting "+ fah +" fahrenheits into Celsius , the answer is "+(double)((fah-32)*5)/9);

    }


}
