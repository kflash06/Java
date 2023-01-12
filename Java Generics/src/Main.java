
public class Main {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        String[] strings = {"Hello", "World"};
        printArray(numbers);
        printArray(strings);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
