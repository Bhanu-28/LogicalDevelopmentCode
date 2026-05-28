package test.interview.day13;

public class FibonacciRecursive {

	public static void main(String[] args) {
		
//		F(N) = F(N-1) + F(N-2)
		
		
		int seqLength = 10;
		
		System.out.println(" A fibonacci sequence of "+seqLength+" numbers: ");
		
		for(int i =0; i < seqLength; i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}

	private static int fibonacci(int count) {
		
		if(count<=1) {
			return count;
		}
		
		return fibonacci(count-1) + fibonacci(count-2);
		
		
		
	}
}
