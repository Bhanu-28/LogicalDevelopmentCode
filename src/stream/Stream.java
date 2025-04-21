package stream;

import java.util.Arrays;

public class Stream {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		int max = Arrays.stream(arr)
						.max()
						.getAsInt();
		
		System.out.println(max);
		String bhanu = "happy";
		int index = bhanu.indexOf("ppy");
		System.out.println(index);
	}

}
