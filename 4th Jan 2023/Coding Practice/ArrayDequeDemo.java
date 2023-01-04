import java.util.*;

public class ArrayDequeDemo {
	public static void main(String args[]) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Naruto");
		dq.addFirst("Itachi");
		dq.addLast("Minato");
		dq.add("Jojo");
		System.out.println(dq); 

		// To Remove the elements

		System.out.println(dq.pop());
		System.out.println(dq.poll());
		System.out.println(dq.pollLast());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());

	}
}

/* OutPut

[Itachi, Naruto, Minato, Jojo]
Itachi
Naruto
Jojo
Minato
null

*/