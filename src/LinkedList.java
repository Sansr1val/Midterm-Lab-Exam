//Data structure used to store the history of the PersistentLinkedList's versions
public class LinkedList {
	private ListNode head;
	private ListNode tail;
	
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	//adds a new data in the list
	public void add(PersistentLinkedList data) {
		ListNode node = new ListNode(data);
		if(head == null || tail == null) {
			head = node;
			tail = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
			tail = node;
		}
	}
	
	//displays the data(versions) of the linkedlist(PersistentLinkedList's history)
	public String display() {
		String str =  "Versions of the linked list:\n";
		int counter = 1;
		ListNode currentNode = head;
		while(currentNode != null) {
			if(currentNode.getData().getHead() == null) {
				str+="Version "+counter+": List is empty.\n";
			}else {
				str+="Version "+counter+": "+currentNode.getData().display()+"\n";
			}
			currentNode = currentNode.getNext();
			counter++;
		}
		return str;
	}
}
