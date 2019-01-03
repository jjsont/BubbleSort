public class runner {

    public static void main(String[] args) {

        int [] arr= helper.randIntArr(100);
        helper.printArray(arr);
        bubbleSort.bubble(arr);
        helper.printArray(arr);

    }
}
