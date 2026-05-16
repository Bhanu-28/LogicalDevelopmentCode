package collections.iterators;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T>{
	
	
	private T[] items;
	private int size;
	
	
	
	@SuppressWarnings("unchecked")
	public OurGenericList() {
		size = 0;
		items = (T[]) new Object[100];
	}
	
	public void add(T item) {
		items[size++] = item;
	}
	
	
	public T getItemAtIndex(int index) {
		
		return items[index];
	}

	@Override
	public Iterator<T> iterator() {
		
		return new OurGenericListIterator(this);
	}
	
	private class OurGenericListIterator  implements Iterator<T>{
		
		
		private OurGenericList<T> list;
		
		public OurGenericListIterator(OurGenericList<T> list) {
			this.list = list;
		}
		
		int index = 0;

		@Override
		public boolean hasNext() {
			
			System.out.println("has next has been called");
			return index < list.size;
		}

		@Override
		public T next() {
			System.out.println("next has been called");
			return list.items[index++];
		}
		
	}


}
