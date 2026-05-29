package test.interview.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlyOddNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list0 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5));
		
		
		System.out.println(onlyOddNumbers(list0));
		System.out.println(onlyOddNumbers(list1));
		
		
	}
	
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		 for (int i : list) {
			 
		  if (i % 2 == 0)
		   return false;
		 }

		 return true;
		}

}
