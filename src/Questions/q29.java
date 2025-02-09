package Questions;

import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        getSumOdd();
    }
    public static void getSumOdd(){
        int sum =0;
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i=i+2);
        }
    }
}
