import java.util.*;

public class DequeExample {
	public static void main(String args[]) {
	Deque<String> deque = new LinkedList<String>();
	deque.add("10 (end)");
	deque.addFirst("1 (start)");
	deque.addLast("9 (end)");
	deque.push("2 (start)");
	deque.offer("8 (end)");
	deque.offerFirst("3 (start)");

	System.out.println(deque + "\n");
	// To remove the first and last element respectively -
	deque.removeFirst();
	deque.removeLast();
	System.out.println("Deque after removing" + " first and last: " + deque);

	}

}

/* OUTPUT

[3 (start), 2 (start), 1 (start), 10 (end), 9 (end), 8 (end)]

Deque after removing first and last: [2 (start), 1 (start), 10 (end), 9 (end)]

*/