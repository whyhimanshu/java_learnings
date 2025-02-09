package Questions;

import java.util.Scanner;

public class q69 {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome check by Leacture.recursion!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string you want to check: ");
        String str = input.next();
        System.out.println("Your string is "+ (isPalindrome(str)?"Palindrome":
                                                                "Not Palindrome"));
    }
    public static boolean isPalindrome(String str) {
        if (str.length()<=1){
            return true;
        }
        int lastPos = str.length()-1;
        if (str.charAt(0)!=str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}