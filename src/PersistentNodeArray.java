
public class PersistentNodeArray {
	private PersistentNode[] nodeArray;
	private int size;
	private int capacity;

	public PersistentNodeArray() {
		size = 0;
		capacity = 10;
		nodeArray = new PersistentNode[capacity];
	}
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return capacity;
	}
	
	public void add(PersistentNode node) {
		if(size == capacity) {
			increaseCapacity();
		}
		nodeArray[size] = node;
		size++;
	}
	public PersistentNode get(int position) {
		return nodeArray[position];
	}

	public void increaseCapacity() {
		// creates a second array with size twice the original
		PersistentNode temp[] = new PersistentNode[capacity*2]; 
		// the values of the original array are transferred to the second 
		for (int i=0; i<capacity; i++) {
			temp[i] = nodeArray[i];
		} 
		// overwrites the original array with the second
		nodeArray = temp;
		// updates the capacity
		capacity = capacity * 2;
	}

}
