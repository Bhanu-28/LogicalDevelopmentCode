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
		
		PriorityQueue<StudentMarks> mpq = new PriorityQueue<>(stMarksList);
		
		List<StudentMarks> top3 = new ArrayList<>();
		
		int index = 0;
		while(!mpq.isEmpty()) {
			if(index == 3) {
				break;
			}
			top3.add(mpq.poll());
			index++;
		}
		
		System.out.println("Top3 students of Maths marks :"+top3);
		
		
		PriorityQueue<StudentMarks> spq = new PriorityQueue<>((s1,s2)->	{
			System.out.println("Comparator Compare method is called");
			return s2.getPhysics()-s1.getPhysics();
		});
		
		for(StudentMarks sm : stMarksList) {
				spq.add(sm);
		}
		
		List<StudentMarks> top3Physics = new ArrayList<>();
		
		int indexp = 0;
		while(!spq.isEmpty()) {
			if(indexp == 3) {
				break;
			}
			top3Physics.add(spq.poll());
			index++;
		}
		
		System.out.println("Top3 students of Physics marks :"+top3Physics);
		
	}
	
	

}
