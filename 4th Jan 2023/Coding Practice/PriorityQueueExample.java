import java.util.*;

public class PriorityQueueExample {
	public static void main(String args[]) {
	PriorityQueue <String> queue = new PriorityQueue <String>();
	queue.add("Ashish");
	queue.add("Bhavesh");
	queue.add("Hrishikesh");
	queue.add("Ketan");
	System.out.println("Head:" + queue.element()); // retrieves 
	System.out.println("Head:" + queue.peek()); // retrives or return null if the queue is empty
	System.out.println("Iteration the elements:");
	Iterator itr = queue.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	queue.remove(); //Retrieves and removes the head of the queue
	queue.poll(); //returns null if the queue is empty
	System.out.println("After Removing two elements");
	Iterator itr2 = queue.iterator();
	while (itr2.hasNext()) {
		System.out.println(itr2.next());
		}

	queue.remove();
	queue.remove();
	queue.poll(); //(Trying to remove from empyt queue which will return null)
	System.out.println("After removing remaining two elements");
	Iterator itr3 = queue.iterator();
	while (itr3.hasNext()) {
		System.out.println(itr3.next());
		}
	}
}

/*Output

Head:Ashish
Head:Ashish
Iteration the elements:
Ashish
Bhavesh
Hrishikesh
Ketan
After Removing two elements
Hrishikesh
Ketan
After removing remaining two elements
*/
