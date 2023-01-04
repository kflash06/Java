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

// Iteration of Elements 

		dq.add("Ketan");
        dq.addFirst("Shinde");
        dq.addLast("Rohit");
        dq.add("FLash");
		System.out.println(dq); 

		System.out.println("Iteration in Ascending order");

		for (Iterator itr = dq.iterator(); itr.hasNext();) {
			System.out.println(itr.next() + "");
		}

		System.out.println("Iteration in Descending order");

		for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
			System.out.println(itr.next() + "");
		}
	}
}

/* OutPut

[Itachi, Naruto, Minato, Jojo]
Itachi
Naruto
Jojo
Minato
null
[Shinde, Ketan, Rohit, FLash]
Iteration in Ascending order
Shinde
Ketan
Rohit
FLash
Iteration in Descending order
FLash
Rohit
Ketan
Shinde


*/