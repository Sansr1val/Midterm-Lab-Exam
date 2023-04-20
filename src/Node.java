
public class Node {
	
	private int data;
	private Node next;
	
	//Constructors
	public Node() {
		this.data = 0;
		this.next = null;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	//setters and getters
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return this.data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return this.next;
	}

}
