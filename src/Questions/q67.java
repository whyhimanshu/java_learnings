package Questions;

public class q67 {
    public static void main(String[] args) {
        System.out.println("weclome to even number printer");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
