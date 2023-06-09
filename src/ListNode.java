
//Nodes used for the LinkedList  class, stores PersistentLinkedList objects as its data
public class ListNode {

	private PersistentLinkedList data;
	private ListNode next;
	private ListNode previous;

	//constructors
	public ListNode() {
		data = new PersistentLinkedList();
		next = null;
		previous = null;
	}
	public ListNode(PersistentLinkedList data) {
		this.data = data;
		next = null;
		previous = null;
	}

	//setters and getters
	public void setData(PersistentLinkedList data) {
		this.data=data;
	}
	public PersistentLinkedList getData() {
		return data;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public ListNode getNext() {
		return next;
	}
	public void setPrevious(ListNode previous) {
		this.previous = previous;
	}
	public ListNode getPrevious() {
		return next;
	}

}
