import java.util.Arrays; 
public class Array {
	public static void main(String args[]) {
	int[] age = {12, 14, 22, 9, 21};
	age[4] = 3;
	System.out.println("Age of ketan is :" + age[2]);
	System.out.println(Arrays.toString(age));
	//using for loop
	 for (int i = 0; i < age.length; i++) {
	 	System.out.println(age[i]);
	}
	
    }
}
