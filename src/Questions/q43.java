package Questions;

public class q43 {
    //done with myself
    public static void main(String[] args) {
        int [] arr = arrayUtility.inputArray();
        boolean checkAscending = isAscending(arr);
        System.out.println("Ascending check found "+checkAscending);
        boolean checkDescending = isDescending(arr);
        System.out.println("Descending check found "+checkDescending);
    }
    public static boolean isDescending(int[] checkDescending){
        int i=1;
        while(i<checkDescending.length){
            if(checkDescending[i]<=checkDescending[i-1]){
                return true;
            }
            i++;
        }
        return false;
    } public static boolean isAscending(int[] checkAscending){
        int i=1;
        while(i<checkAscending.length){
            if(checkAscending[i]>=checkAscending[i-1]){
                return true;
            }
            i++;
        }
        return false;
    }

}
