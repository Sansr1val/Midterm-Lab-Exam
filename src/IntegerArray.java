//A dynamic array used to store the position of the deleted PersistentNode objects
public class IntegerArray {
	private int[] arrayNum;
	private int size;
	private int capacity;

	//Constructor
	public IntegerArray() {
		size = 0;
		capacity = 10;
		arrayNum = new int[capacity];
	}
	//getters
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return capacity;
	}

	//Adds a new data in the array, the size is doubled when the arra is full
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

	//Doubles the capacity of the array by making a new array of double the size,
	//then copies the old array into the new array
	public void increaseCapacity() {
		int temp[] = new int[capacity*2]; 
		for (int i=0; i<capacity; i++) {
			temp[i] = arrayNum[i];
		} 
		arrayNum = temp;
		capacity = capacity * 2;
	}

}
