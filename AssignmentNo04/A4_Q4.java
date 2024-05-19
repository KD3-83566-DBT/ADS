package AssignmentNo04;

import AssignmentNo04.List33.Node;

//import AssignmentNo04.List22.Node;

class List33{
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private int count;

	public List33() {
		setHead(null);
		count = 0;
	}

	public boolean isEmpty() {
		return getHead() == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			setHead(newnode);
		else {
			newnode.next = getHead();
			setHead(newnode);
		}
	}
	public void display() {
		if (isEmpty()) {
			System.out.println("given linked list is empty");
		} else {
			Node trav = getHead();
			while (trav != null) {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}
	//Node trav1=head;
	public void rDisplay(Node trav) {
		if(trav==null) {
			return;
		}
		
		rDisplay(trav.next);
		System.out.print(" "+trav.data);
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
}
public class A4_Q4 {

	public static void main(String[] args) {
		List33 l1=new List33();
		l1.addFirst(44);
		l1.addFirst(33);
		l1.addFirst(22);
		l1.addFirst(11);
		Node trav=l1.getHead();
		l1.rDisplay(trav);
	}

}
