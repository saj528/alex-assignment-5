import java.util.ArrayList;
import java.util.Objects;

public class CustomArrayList<T> implements CustomList<T> {
	public Object[] items = new Object[10];

	@Override
	public boolean add(T item) {

		if(Integer.valueOf(getSize()).equals(items.length)){

			Object[] tempArray = new Object[items.length * 2];
			int tempArrayIndex = 0;
			for (Object object: items) {
				tempArray[tempArrayIndex++] = object;
			}
			items = tempArray;
		}

		items[getSize()] = item;
		return true;
	}

	@Override
	public int getSize() {

		int count = 0;

		for(int i = 0; i <= items.length - 1;i++){
			if(items[i] != null){
				count++;
			}
		}

		return count;

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
