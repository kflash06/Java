public class Main {
    public static void main(String[] args) {
            BubbleSort bs = new BubbleSort();
            int arr[] = { 5, 2, 7, 8, 5};
            bs.bubbleSort(arr);
            System.out.println("Sorted array");
            bs.printArray(arr);
    }
}
