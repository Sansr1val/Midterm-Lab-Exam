
public class IntegerArray {
	private int[] arrayNum;
	private int size;
	private int capacity;

	public IntegerArray() {
		size = 0;
		capacity = 10;
		arrayNum = new int[capacity];
	}
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return capacity;
	}
	
	public void add(int data) {
		if(size == capacity) {
			increaseCapacity();
		}
		arrayNum[size] = data;
		size++;
	}
	public int get(int position) {
		return arrayNum[position];
	}

	public void increaseCapacity() {
		// creates a second array with size twice the original
		int temp[] = new int[capacity*2]; 
		// the values of the original array are transferred to the second 
		for (int i=0; i<capacity; i++) {
			temp[i] = arrayNum[i];
		} 
		// overwrites the original array with the second
		arrayNum = temp;
		// updates the capacity
		capacity = capacity * 2;
	}

}
