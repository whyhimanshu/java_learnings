package Questions.q82;

public class arrayOperations {
    private int arr [];

    public arrayOperations(int[] arr) {
        this.arr = arr;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int nums : arr) {
                sum+=nums;
            }
            return sum/arr.length;

        }
        double median(){
            return 0;

        }

    }
}
