package AssignmentNo04;

//import Basic_DS.List1.Node;

class List12 {
	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	Node tail;

	List12() {
		tail = null;
	}

	public boolean isEmpty() {
		return (tail == null);
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		} else {
			// Node trav=tail;
			newnode.next = tail.next;
			tail.next = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else if (tail == tail.next)
			tail = null;
		else {
			tail.next = tail.next.next;
		}
	}

	public void deletelast() {
		if (isEmpty())
			return;
		else if (tail == tail.next) {
			tail = null;
		} else {
			Node trav = tail;
			while (trav.next!= tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
	}

	public void display() {
		if (isEmpty())
			return;
		else {
			Node trav = tail.next;
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			} while (trav != tail.next);
			System.out.println("");
			System.out.println("tail=" + tail.data);

		}
	}
}

public class A4_Q2 {

	public static void main(String[] args) {
		List12 l1 = new List12();
		l1.addFirst(44);
		l1.addFirst(33);
		l1.addFirst(22);
		l1.addFirst(11);
		l1.display();
		// l1.addLast(55);
		// l1.deleteFirst();
		l1.deletelast();
		l1.display();
	}

}
