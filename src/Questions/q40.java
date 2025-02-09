package Questions;

public class q40 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum-Average Calculator!");
        int[] numArray = arrayUtility.inputArray(); //USE OTHER CLASSES OR JAVA FILES
        long sum = sum(numArray);
        double average = avg(numArray);
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+average);

    }
    public static long sum(int[] Array){
        int sum=0;
        int index =0;
        while (index<Array.length){
            sum+=Array[index];
            index++;
        }
        return sum;
    }
    public static double avg(int[] Array){
        long sum = sum(Array);
        return (double) sum/Array.length;
    }
}
