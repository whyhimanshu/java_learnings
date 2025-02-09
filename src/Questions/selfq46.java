package Questions;

public class selfq46 {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome checker!!");
        int [] arr = arrayUtility.inputArray();
        palindromeCheck(arr);

    }
    public static void palindromeCheck(int[] arr){
        int i=0;
        while(i<arr.length/2) {
            if (arr[i] == arr[(arr.length - 1) - i]) {
                System.out.println("Given Array is palindrome");
            }

            i++;
        }
    }
}
