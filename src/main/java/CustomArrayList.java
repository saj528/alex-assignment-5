import java.util.ArrayList;
import java.util.Objects;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	private int size = 0;

	@Override
	public boolean add(T item) {

		if(getSize() == items.length){

			Object[] tempArray = new Object[items.length * 2];
			int tempArrayIndex = 0;
			for (Object object: items) {
				tempArray[tempArrayIndex++] = object;
			}
			items = tempArray;
		}

		items[getSize()] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if(index >= items.length){
			System.out.println("Index outside of array length");
			return null;
		}
		return (T)items[index];
	}
	
}
