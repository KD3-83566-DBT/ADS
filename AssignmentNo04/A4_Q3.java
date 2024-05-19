package AssignmentNo04;

//import Basic_DS.List.Node;

class List22 {
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

	public List22() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addAfther(int value, int pos) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;
			for (int i = 0; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;

		}
	}
	public void addBefore(int value, int pos) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;

		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("given linked list is empty");
		} else {
			Node trav = head;
			while (trav != null) {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}
}

public class A4_Q3 {

	public static void main(String[] args) {
		List22 l1 = new List22();
		l1.addFirst(44);
		l1.addFirst(33);
		l1.addFirst(22);
		l1.addFirst(11);
		l1.display();
		l1.addAfther(99, 3);
		//l1.addBefore(99, 3);
		l1.display();
	}

}
