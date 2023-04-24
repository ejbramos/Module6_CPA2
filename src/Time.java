import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

public class Time {
    public static void selectionSort(int arr[]){
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    static void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    static void printList(LinkedList<Double> arr)
    {
        int n = arr.size();
        for (int i = 0; i < n; ++i)
            System.out.print(arr.pollFirst() + " ");

        System.out.println();
    }
    static int[] initialize(){
        LinkedList<Integer> intLinked = new LinkedList<Integer>();

        for(int i = (int) Math.pow(2,15); i>-1; i--){
            intLinked.offer(i);
        }
        Object[] arr = intLinked.toArray();
        int length = arr.length;
        int[] dArr = new int[length];
        for(int i =0; i < arr.length; i++) {
            dArr[i] = (int) arr[i];
        }

        return dArr;
    }
    public static void main(String[] args){
        int[] arr = initialize();
        MergeSort mergeSort = new MergeSort();
        GFG quickSort = new GFG();

        Instant start = Instant.now();

        quickSort.quickSort(arr,0,arr.length-2);
        Instant end = Instant.now();

        System.out.println("Sorted Data");
        printArray(arr);

        Duration timeElapsed = Duration.between(start, end);

        System.out.println("Time elapsed: "+ timeElapsed.toMillis() +" ms");

    }
}
