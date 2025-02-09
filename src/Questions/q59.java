package Questions;

import java.util.Scanner;

public class q59 {
    public static void main(String[] args) {
        System.out.println("Welcome to password checker !!");
        Scanner input = new Scanner(System.in);
        String pass;
        boolean isValid;
        do {
            System.out.println("Enter your password: ");
            pass = input.next();
        }while(!checkPass(pass));
        System.out.println("All good");
    }
    public static boolean checkPass(String pass){
        return pass.length()>6;
        }
    }
