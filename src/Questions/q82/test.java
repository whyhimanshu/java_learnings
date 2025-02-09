package Questions.q82;

public class test {
    public static void main(String[] args) {
        arrayOperations opr = new arrayOperations(new int[] {1,2,3,4,5});
        arrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
