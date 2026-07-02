package collections.queue.priority;

public class StudentMarks {
	
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
	
	
	

}
