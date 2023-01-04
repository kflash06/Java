import java.util.*;

public class ArrayDequeDemo {
	public static void main(String args[]) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Naruto");
		dq.addFirst("Itachi");
		dq.addLast("Minato");
		dq.add("Jojo");
		System.out.println(dq); 
	}
}