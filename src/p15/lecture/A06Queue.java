package p15.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class A06Queue {
	public static void main(String[] args) {
		Queue<Integer> queue =  new LinkedList<>();
		queue.offer(9);
		queue.offer(3);
		queue.offer(4);
		
		int f = queue.poll();
		System.out.println(f);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		queue.offer(30);
		queue.offer(20);
		queue.offer(10);
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}
}
