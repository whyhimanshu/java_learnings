package Leacture.exception;

public class throwThrows {
    public void printName(String name)
    throws IllegalArgumentException {
        if (name.contains("-")) {
           throw new IllegalArgumentException("Name contains -");
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        throwThrows t1 = new throwThrows();
        t1.printName("Himanshu-Verma");
    }
}
