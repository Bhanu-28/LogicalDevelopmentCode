package collections.queue.priority;

import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class PriorityImplementation {
	

	public static void main(String[] args) {
		List<StudentMarks> stMarksList = new ArrayList<>();
		
		stMarksList.add(new StudentMarks(80,50));
		stMarksList.add(new StudentMarks(100,30));
		stMarksList.add(new StudentMarks(60,20));
		stMarksList.add(new StudentMarks(90,70));
		stMarksList.add(new StudentMarks(120,60));
		
		PriorityQueue<StudentMarks> pq = new PriorityQueue<>(stMarksList);
		
		List<StudentMarks> top3 = new ArrayList<>();
		
		int index = 0;
		while(!pq.isEmpty()) {
			if(index == 3) {
				break;
			}
			top3.add(pq.poll());
			index++;
		}
		
		System.out.println("Top3 students of Maths marks :"+top3);
		
	}
	
	

}
