public class runner {

    public static void main(String[] args) {

      int [] randIntArr= helper.randIntArr(5);

        System.out.println("Before: ");
        for(int num:randIntArr) {
            System.out.println(num + " ");
        }
        System.out.println();


        bubbleSort.bubble(randIntArr);

        System.out.println("After: ");
        for(int num:randIntArr) {
            System.out.println(num+ " ");
        }

        helper.printArray(randIntArr);

        }

    }
