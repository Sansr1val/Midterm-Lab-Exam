
public class Stack {
	private Node head;
	
	//Constructor
	public Stack() {
		head = null;
	}
	public Stack(int data) {
		head = new Node(data);
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getHead() {
		return head;
	}

	//Pushes at the the data at the top of the stack
	public void push(int data) {
		Node node = new Node(data);
		node.setNext(head);
		head = node;
	}
	//Pops the data at the top of the stack
	public void pop() {
		head = head.getNext();
	}
}
