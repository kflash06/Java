import java.util.*;

public class IsSubArray {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr1 = new int[10];
	int[] arr2 = new int[10];


	public static boolean isSubArray(int[] arr1, int[] arr2) {
		for (int i = 0; i < n; i++) {
		arr1[i] = sc.nextInt();
		for (int j = 0; j < 0; j++ ) {
			arr2[j] = sc.nextInt();
		}
		if (arr1[i] == arr2[j])
			return true;
	}
	return false;
}
}
}