import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		//it follows min heap datastructure
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);

		System.out.println(pq);
	}

}
