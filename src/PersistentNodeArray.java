
//A dynamic array used to store the deleted PersistentNodes of the PersistentLinkedList class
public class PersistentNodeArray {
	private PersistentNode[] nodeArray;
	private int size;
	private int capacity;

	//Constructor
	public PersistentNodeArray() {
		size = 0;
		capacity = 10;
		nodeArray = new PersistentNode[capacity];
	}
	//getters
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return capacity;
	}
	
	//Adds a new data in the array, the size is doubled when the arra is full
	public void add(PersistentNode node) {
		if(size == capacity) {
			increaseCapacity();
		}
		nodeArray[size] = node;
		size++;
	}
	//returns the data in a given position in the array
	public PersistentNode get(int position) {
		return nodeArray[position];
	}

	//Doubles the capacity of the array by making a new array of double the size,
	//then copies the old array into the new array
	public void increaseCapacity() {
		PersistentNode temp[] = new PersistentNode[capacity*2]; 
		for (int i=0; i<capacity; i++) {
			temp[i] = nodeArray[i];
		} 
		nodeArray = temp;
		capacity = capacity * 2;
	}
}
