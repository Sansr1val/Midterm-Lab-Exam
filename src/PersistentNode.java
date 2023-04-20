
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
		dataHistory = new Stack();
		dataHistory.push(data);
		next = null;
		previous = null;
	}
	public void setNext(PersistentNode next) {
		this.next = next;
	}
	public PersistentNode getNext() {
		return next;
	}
	public void setPrevious(PersistentNode previous) {
		this.previous = previous;
	}
	public PersistentNode getPrevious() {
		return previous;
	}
	
	
	
	//Adds a new value at the Node's data history
	public void addData(int data) {
		dataHistory.push(data);
	}
	
	//Returns the data of the stack's head; the Persistent Nodes' recent value.
	public int getData() {
		return dataHistory.getHead().getData();
	}
}
