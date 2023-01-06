import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 8, 5};
        System.out.println("Array: " + Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
