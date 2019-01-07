public class bubbleSort {

    public static void bubble(int[] arr) {
    boolean swapped=false;
    while(swapped) {
        for(int i=0; i<arr.length -1; i++) {
            for(int j=0; j<arr.length-1; i++) {
            if (arr[i] >arr[i+1]) {
                helper.swap(arr, i ,j);
                swapped=true;

            }
        }
    }

    }
    }


    public static boolean isSorted(int [] arr) {
        for(int i=0; i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
        }
    public static boolean checkSum(int []before, int[]after) {
        int sum1=0;
        int sum2=0;
        if(before.length == after.length) {
            for(int i=0; i<before.length;i++) {
                sum1= sum1+before[i];
                sum2= sum2+ after[i];
            }
        }
        else {
            return false;
        }
}}


