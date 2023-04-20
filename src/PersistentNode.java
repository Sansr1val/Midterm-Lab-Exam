
public class PersistentNode {
	private Stack dataHistory;
	private PersistentNode next;
	private PersistentNode previous;
	
	//Default constructor
	public PersistentNode() {
		dataHistory = new Stack();
		next = null;
		previous = null;
	}
	//Parameterized constructor
	public PersistentNode(int data) {
		dataHistory = new Stack(data);
		next = null;
		previous = null;
	}
	
	//Returns the data of the stack's head; the Persistent Nodes' recent value.
	public int getData() {
		return dataHistory.getHead().getData();
	}
	
	

}
