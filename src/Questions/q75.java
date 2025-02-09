package Questions;

public class q75 {
    public static void main(String[] args) {
        String[] arr = new String[] {"Hi","this","is","Himanshu Verma"};
        StringBuilder sb = new StringBuilder();
        for (String s1 : arr) {
            sb.append(s1).append(" "); // String Builder uses less memory
        }
        System.out.println(sb);
    }
}
