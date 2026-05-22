package test.interview.day10;

public class CustomArrayList {
	
	public static void main(String[] args) {
		
		MyArrayList<String> list = new MyArrayList<>();
		
		 list.add("Apple");
	     list.add("Ball");
	     list.add("Cat");

	     // Get element
	     System.out.println("Element at index 1: " + list.get(1));
	}

}

class MyArrayList<T>{
    
    private Object[] arr;
    
    private int size = 0;
    
    private int capacity = 10;
    
    public MyArrayList(){
        arr = new Object[capacity];
    }
    
    public void add(T element){
        
        if(size == capacity){
            resize();
        }
        
        arr[size++] = element;
    }
    
    public T get(int index){
        
        return (T) arr[index];
    }
    
    private void resize(){
            
            capacity = capacity * 2;
            
            Object[] temp = new Object[capacity];
            
            for(int i =0; i < size; i++){
                temp[i] = arr[i];
            }
        }
}
