package Leacture.polymorphism;

public class Overloading {
    Overloading() {
        System.out.println("Default constructor");
    }
    Overloading(String s1){
        System.out.println(s1);
    }
    int sum(int a, int b) {
       return a+b;
    }
    int sum(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        System.out.println(o1.sum(1,2));
    }
}
