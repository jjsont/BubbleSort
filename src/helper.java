public class helper {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }


    public static void printArray(int[] arr) {
       String output= "";
       for(int i=0; i<arr.length; i++) {
           output= output + "[" + arr[i] + "] ";
       }
        System.out.println(output);
    }

    public static int[] randIntArr(int Count) {
        int[] array = new int[Count];
        for(int i=0; i<array.length; i++) {
            array[i]= (int)(Math.random()* Count + 1);
        }
        return array;

    }



}
