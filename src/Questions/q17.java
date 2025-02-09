package Questions;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        System.out.println("Enter your marks in Physics: ");
        Scanner input = new Scanner(System.in);
        int phy = input.nextInt();
        System.out.println("Enter your marks in Chemistry : ");
        int chem = input.nextInt();
        double per = (((phy+chem)/200.0)*100);

        System.out.println((double)per);
    }
}
