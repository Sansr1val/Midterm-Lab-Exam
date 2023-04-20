
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
	
	public void delete(int position) {
		
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
