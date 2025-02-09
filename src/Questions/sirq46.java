package Questions;

public class sirq46 {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome checker!!");
        int [] arr = arrayUtility.inputArray();
        boolean isPali = isPalindrome(arr);
        if(isPali){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is not palindrome");
        }
    }
    public static boolean isPalindrome(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
