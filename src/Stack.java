
public class Stack {
	private Node head;
	
	//Constructor
	public Stack() {
		head = null;
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
	//Displays the contents of the stack
	public String display() {
		Node currentNode = head;
		String str = "";
		if(head.getNext() == null) {
			return str+=head.getData();
		}else {
			while(currentNode != null) {
				str += currentNode.getData()+", ";
				currentNode = currentNode.getNext();
			}
			if(str!="") {
				str = str.substring(0,str.length()-5)+" and "+ str.substring(str.length()-4,str.length()-2)+".";
			}
			return str;
		}
	}
}
