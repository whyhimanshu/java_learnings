package Questions;

public class q45 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reverser Tool!!");
        int [] arr = arrayUtility.inputArray();
        int[] revArr = revArr(arr);
        System.out.println("Here is your reversed Leacture.array: ");
        arrayUtility.displayArray(revArr);
    }
    public static int[] revArr(int[] arrToRev){
        int i=0;
        while(i<arrToRev.length/2){
            int swap = arrToRev[i];
            arrToRev[i]= arrToRev[(arrToRev.length-1)-i];
            arrToRev[(arrToRev.length-1)-i]=swap;
            i++;
        }
        return arrToRev;






    }
}
