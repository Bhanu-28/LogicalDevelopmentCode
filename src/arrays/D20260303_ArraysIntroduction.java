package arrays;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class D20260303_ArraysIntroduction {
	
	public static void main(String[] args) {
		
		//ways to create an array in java.
		
		/*
		 * 	1. Declaration and Dynamic Allocation (specifying size):
		  
		  	dataType[] arrayName = new dataType[size];
		  	int[] numbers = new int[5]; 
		  
		    2. Using Array Literals (specifying values directly):
		  
		  	int[] numbers = {10, 20, 30, 40, 50};
		  
		  	3. Declaration first, then Initialization with Values:
		  
		  	dataType[] arrayName;
		   	arrayName = new dataType[]{value1, value2, value3};
		   	// Example:
		   	int[] numbers;
		   	numbers = new int[]{1, 2, 3, 4, 5};
		  
		 */
		
		
		
		System.out.println("-----------------------");
		System.out.println("-----Insertion---------");
		
		System.out.print("First Name : ");

		char[] firstName = {'B','h','a','n','u'};
		
		for(char elem : firstName) {
			System.out.print(elem+" ");
		}
		
		System.out.println();
		
		System.out.print("Element at Position 3 : ");
		System.out.println(firstName[2]);
		
		System.out.println("-----------------------");
		
		
		
		
		//Creating a new character array with size 7.
		
		char[] lastName = new char[7];
		String lastNameStr = "Pradee";

		System.out.println("Copying the elements from one array to other for insertion of New element");
		
		for(int i = 0 ; i < lastNameStr.length() ; i++) { 
			lastName[i] = lastNameStr.charAt(i);
		}
		
		System.out.print("Last Name : ");
		System.out.println(lastName);
		
		System.out.println("Inserting an element p at the end.");
		
		
		char[] charInsertAtEnd = insertAtEnd(lastName,'p');
		
		System.out.print("Last Name : ");
		System.out.println(charInsertAtEnd);
		
		
		System.out.println("--------------------------------------");
		
		System.out.println("Inserting an element at  Given Position ");
		
		
		char[] newFirstName = insertAtGivenPosition(firstName,'G',0);
		
		char[] newFirstName1 = insertAtGivenPosition(newFirstName,'.',1);
		
		
		char[] newFirstName2 = insertAtGivenPosition(newFirstName1,' ',2);
		
		System.out.println(newFirstName2);
		
		System.out.println("-----------------------");
		
		
		System.out.println("-----------------------");
		
		System.out.println("-----Deletion-------");
		
		System.out.println("Deleting char in first name");
		
		
		System.out.println("Length of char array Before deletion : "+newFirstName2.length);
		System.out.println(newFirstName2);
		
		//checking if element exists or not.
		
		int lengthOfFirstName = newFirstName2.length;
		char elementToDelete = ' ';
		int indexToDelete = -1;
		
		
		for(int i = 0; i < lengthOfFirstName; i ++ ) {
			
			if(newFirstName2[i] == elementToDelete) {
				indexToDelete = i;
				System.out.println("Found element at index : "+indexToDelete);
				break;
			}
		}
		
		if(indexToDelete == -1) {
			throw new NoSuchElementException("Element "+elementToDelete + " Not Found");
		}
		
		
		for ( int i = indexToDelete+1; i < lengthOfFirstName; i ++) {
			newFirstName2[i-1] = newFirstName2[i];
		}
		
		lengthOfFirstName = lengthOfFirstName - 1;
		
		System.out.println("Length of char array after deletion : "+lengthOfFirstName);
		System.out.println(newFirstName2);
		
		/*
		 * 
		 * Memory: Arrays.copyOf allocates a brand-new memory block of the specified length.
		   Reference: The variable newFirstName2 stops pointing to the old array (8 slots) and starts pointing to the new one (7 slots).
		   Garbage Collection: The old array is eventually deleted by Java since nothing is using it anymore.
		 */
		newFirstName2 = Arrays.copyOf(newFirstName2, lengthOfFirstName);
		
		System.out.println(newFirstName2);
		
		
		// Manual approach
		
		char[] tempArray = new char[lengthOfFirstName];
		for (int i = 0; i < lengthOfFirstName; i++) {
		    tempArray[i] = newFirstName2[i];
		}
		newFirstName2 = tempArray; 
		
		
		System.out.println(newFirstName2);
		
		
	}

	/*
		Easy logic Just insert the element by index of length -1.
	 */

	private static char[] insertAtEnd(char[] lastName, char elemToInsert) {
		int length = lastName.length;
		System.out.println("length of char array : "+length);
		
		lastName[length-1] = elemToInsert;
		
		return lastName;
	}
	
	private static char[] insertAtGivenPosition(char[] charArray, char elemToInsert, int position) {
		
		
		//creating a new array for extra size and copy the elements.
		
		int length = charArray.length;
		
		char[] charArrayNew = new char[length+1];

		// copy all the elements from one array to other.
		for(int i = 0 ; i < length; i ++) {
			charArrayNew[i] = charArray[i];
		}
		
		// right shift the elements to insert the element at the position Given.
		for(int i = length - 1; i >= position; i --) {
			charArrayNew[i+1] = charArrayNew[i];
		}
		
		charArrayNew[position] = elemToInsert;
		
		return charArrayNew;
		
	}

}
