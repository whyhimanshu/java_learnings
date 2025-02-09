package Questions;

import java.util.Scanner;

public class q57 {
    public static void main(String[] args) {
        System.out.println("Welcome to month mapping! ");
        System.out.print("Please enter month number: ");
        Scanner input = new Scanner(System.in);
        int monthh = input.nextInt();
        String month = getMonth(monthh);
        System.out.println("Month is "+ month);
    }
    public static String getMonth(int month){
        return switch(month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "sep";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default  ->"Invalid month";
        };
    }
}
