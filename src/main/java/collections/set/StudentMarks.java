package collections.set;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks>{
	
	private int physics;
	private int maths;
	
	public StudentMarks(int physics,int maths) {
		this.physics = physics;
		this.maths = maths;
	}
	
	@Override
	public String toString() {
		return "StudentMarks [physics=" + physics + ", maths=" + maths + "]";
	}

	public int getPhysics() {
		return physics;
	}

	public int getMaths() {
		return maths;
	}

	@Override
	public int compareTo(StudentMarks o) {
		
		/*
		 * 
		 * 1. current object is less than other object return -1 any negative
		 * 2. current object is greater than other object return +1 any positive
		 * 2. current object is equal to other object return 0
		 */
		
//		if(this.maths < o.maths) 
//			return -1;
//		if(this.maths > o.maths)
//			return 1;
//		else
//			return 0;
		
		// descending
		System.out.println("Comparable comapareTo method is called");
		return o.maths - this.maths;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(maths, physics);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMarks other = (StudentMarks) obj;
		return maths == other.maths && physics == other.physics;
	}
	
	
	
	
	

}
