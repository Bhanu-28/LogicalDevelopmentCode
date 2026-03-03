package arrays;


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
		
		
		
		
		System.out.print("First Name : ");

		char firstName[] = {'b','h','a','n','u'};
		
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
		
		System.out.println("Inserting an element at position Given Position ");
		
		
		char[] newFirstName = insertAtGivenPosition(firstName,'G',0);
		
		System.out.println(insertAtGivenPosition(newFirstName,'.',1));

		
		
		
	}

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
		
		for(int i = 0 ; i < length; i ++) {
			charArrayNew[i] = charArray[i];
		}
		
		
		for(int i = length - 1; i >= position; i -- ) {
			charArrayNew[i+1] = charArrayNew[i];
		}
		
		charArrayNew[position] = elemToInsert;
		
		return charArrayNew;
		
	}

}
