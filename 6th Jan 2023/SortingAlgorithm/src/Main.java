import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 8, 5};
        System.out.println("Given Array: " + Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("Sorted Array with Bubble Sort: " + Arrays.toString(arr));

        InsertionSort.insertionSort(arr);
        System.out.println("Sorted Array with Insertion Sort: " + Arrays.toString(arr));

    }
}
