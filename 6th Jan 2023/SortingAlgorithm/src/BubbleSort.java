public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

// 5, 2, 7, 8, 5
// 2, 5, 7, 8, 5
// 2, 5, 5, 8, 7
// 2, 5, 5, 7, 8
