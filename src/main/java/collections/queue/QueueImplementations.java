package collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueImplementations {
	
	
	public static void main(String[] args) {
		
		
		// Queue is interface implementation we can use LinkedList.
		// FIFO
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.offer(2);
		queue.offer(3);
		
		
		System.out.println("-----Queue start-----");
		
		System.out.println(queue);
		
		System.out.println("peek :"+queue.peek());
		System.out.println(queue.poll());
		System.out.println("peek :"+queue.peek());
		System.out.println(queue.poll());
		System.out.println("peek :"+queue.peek());
		System.out.println(queue.poll());
		
		// No element present it will return null
		System.out.println("peek :"+queue.peek());
		
		System.out.println("-----Queue END-----");
		
		
		// For stack there is a separate class which is present. use this.
		System.out.println("-----Stack start-----");
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println("-----Stack end-----");
		
		
		System.out.println("-----DeQueue start-----");
		Deque<Integer> deque1 = new ArrayDeque<>();
		
		// Using Deque as a Queue (FIFO)
		deque1.offerLast(1);
		deque1.offerLast(2);
		deque1.offerLast(3);
		
		System.out.println(deque1);
		
		System.out.println(deque1.pollFirst());
		System.out.println(deque1.peekFirst());
		
		System.out.println(deque1);
		
		Deque<Integer> deque2 = new ArrayDeque<>();
		
		// Using Deque as a Stack (LIFO)
		
		deque2.offerFirst(1);
		deque2.offerFirst(2);
		deque2.offerFirst(3);
		
		System.out.println(deque2);
		
		System.out.println(deque2.pollFirst());
		
		
		System.out.println(deque2);
		
		System.out.println("-----DeQueue END-----");
		
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.offer(1);
		priorityQueue.offer(2);
		priorityQueue.offer(3);
		priorityQueue.offer(5);
		priorityQueue.offer(0);
		priorityQueue.offer(100);
		
		
		List<Integer> top2 = new ArrayList<>();
		int index = 0;
		while(!priorityQueue.isEmpty()) {
			if(index ==2)
				break;
			top2.add(priorityQueue.poll());
			index++;
		}
		System.out.println("test");
		System.out.println("top2 : "+top2);
		System.out.println("priorityQueue : "+priorityQueue);
		
		
		// what if we want top2 elements instead of bottom2
		
		
		
	}
	

}
