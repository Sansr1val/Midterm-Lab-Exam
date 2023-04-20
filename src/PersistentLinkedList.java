
public class PersistentLinkedList {
	
	private PersistentNode head;
	private PersistentNode tail;
	private IntegerArray deletedNodePosition;
	private PersistentNodeArray deletedNodeArray;
	private int size;
	
	public PersistentLinkedList() {
		head = null;
		tail = null;
		deletedNodePosition = new IntegerArray();
		deletedNodeArray = new PersistentNodeArray();
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	//Adds a new node at the end of the list, the size increase after each addition.
	public void add(int data) {
		PersistentNode node = new PersistentNode(data);
		if(head == null || tail == null) {
			head = node;
			tail = node;
			size ++;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
			tail = node;
			size ++;
		}
	}
	
	/*
	 * Deletes a node depending on the position input of the user.
	 * Utilizes the size class filed to determine the node position.
	 * If found, disconnects the node and saves it to an array together with its position.
	 * Reduces the size after deletion.
	 */
	public void delete(int position) {
		PersistentNode nodeToDelete = head;
		for(int i = 0; i<size; i++) {
			nodeToDelete = nodeToDelete.getNext();
		}
		nodeToDelete.getPrevious().setNext(nodeToDelete.getNext());
		nodeToDelete.getNext().setPrevious(nodeToDelete.getPrevious());
		deletedNodeArray.add(nodeToDelete);
		deletedNodePosition.add(position);
	}
	
	public String display() {
		return "";
	}
	public String displayNodeHistory(int position) {
		return "";
	}
	public String displayListHistory() {
		return "";
	}
	
	

}
