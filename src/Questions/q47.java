package Questions;

public class q47 {
    public static void main(String[] args) {
        System.out.println("Welcome to Leacture.array merger");
        int [] arr1 = arrayUtility.inputArray();
        int [] arr2 = arrayUtility.inputArray();
        int [] mergedArr = mergearr(arr1,arr2);
        System.out.println("Your merged Leacture.array is: ");
        arrayUtility.displayArray(mergedArr);
    }
    public static int[] mergearr(int[] arr1,int[] arr2){
        int newSize = arr1.length+arr2.length;
        int [] mergedarr = new int[newSize];
        int i=0,j=0,k=0;
        while(i<arr1.length || j< arr2.length){
            if((arr1[i]<arr2[j] && i<arr1.length)||j==arr2.length){ //if j ended
                mergedarr[k]=arr1[i];
                i++;
                k++;

            }
            else {
                mergedarr[k]=arr2[j];
                k++;
                j++;

            }

        }
        return mergedarr;

    }
}
