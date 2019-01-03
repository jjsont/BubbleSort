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
}}
