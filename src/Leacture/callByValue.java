package Leacture;

public class callByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int add= add(x,y);
        System.out.println(add);
    }
    public static int add(int a, int b){
        return a+b;
    }
}
