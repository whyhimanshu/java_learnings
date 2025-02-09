package Questions;

public class q42 {
    public static void main(String[] args) {
        int[] arr= arrayUtility.inputArray();
        int max= max(arr);
        int min= min(arr);
        System.out.println("The maximum element is "+max);
        System.out.println("The minimum element is "+min);
    }
    public static int max(int [] maxArray){
        if(maxArray.length==0){
            return Integer.MIN_VALUE;
        }
        int max = maxArray[0];
        int i=0;
        while(i< maxArray.length){
            if(max<maxArray[i]){
                max=maxArray[i];
            }
            i++;
        }
        return max;


    }
    public static int min(int[] minArray){
        int min = Integer.MAX_VALUE;
        int i =0;
        while(i<minArray.length){
            if (min>minArray[i]){
                min =minArray[i];
            }
            i++;
        }
        return min;
        

    }
}


// TWO APPROACHES:
// 1.) BY ASSUMING MAXIMUM OR MINIMUM AS FIRST ELEMENT OF ARRAY.(DONE IN MAXIMUM ONE)
// 2.) BY DECLARING MAXIMUM OR MINIMUM AS HIGHEST i.e. assuming maxiumum as most minimum one and most minimum as the maxiumum one. (USED IN MINIMUM ONE)