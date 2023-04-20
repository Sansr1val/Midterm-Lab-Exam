
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
		for(int i = 0; i<position; i++) {
			nodeToDelete = nodeToDelete.getNext();
		}
		nodeToDelete.getPrevious().setNext(nodeToDelete.getNext());
		nodeToDelete.getNext().setPrevious(nodeToDelete.getPrevious());
		deletedNodeArray.add(nodeToDelete);
		deletedNodePosition.add(position);
	}
	
	/*
	 * Locates the node to be changed using the position input of the user.
	 * Adds the new data into the PersistentNode's data history to update its data.
	 */
	public void changeValue(int position, int data) {
		PersistentNode currentNode = head;
		for(int i = 0; i<position;i++) {
			currentNode = currentNode.getNext();
		}
		currentNode.addData(data);
	}
	
	//Displays the list from head to tail;
	public String display() {
		String str =  "";
		PersistentNode currentNode = head;
		while(currentNode != null) {
			str+=currentNode.getData()+", ";
			currentNode = currentNode.getNext();
		}
		if(str != "") {
			str = str.substring(0,str.length()-2);
		}
		return str;
	}
	//Displays current and past values of a given node.
	public String displayNodeHistory(int position) {
		String str = "";
		PersistentNode currentNode = head;
		for(int i = 0; i<position-1;i++) {
			currentNode = currentNode.getNext();
		}
		str += "Current value of node "+position+" is "+currentNode.getData()+"\nPrevious values of node "+position
				+" are "+currentNode.displayDataHistory();
		return str;
	}
	//Displays the current existing node values and the deleted nodes' values together with its past position.
	public String displayListHistory() {
		String str = "";
		str += "Current existing nodes values: \n"+display()+"\n Deleted nodes most recent values: \n";
		for(int i = 0; i<size; i++) {
			if(deletedNodeArray.get(i) != null) {
				str+= "Deleted node's position: "+deletedNodePosition.get(i)+"\nDeleted node's value: "+deletedNodeArray.get(i).getData()+"\n\n";
			}
		}
		return str;
	}
	
	

}
