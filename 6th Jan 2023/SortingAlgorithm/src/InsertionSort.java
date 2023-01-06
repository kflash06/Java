public class InsertionSort {
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[i] = arr[j];
                j--;
            }
            arr[i] = key;
        }
    }
}
