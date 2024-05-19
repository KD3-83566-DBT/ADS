package AssignmentNo04;
class List{
	static class Node{
		int data;
		Node next;
		Node(int value){
			data=value;
			next=null;	
		}
	}
	Node head;
	Node tail;
	List(){
		head=tail=null;
	}
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	public void addFirst(int value){
		Node newnode= new Node(value);
		if(isEmpty())
			head=tail=newnode;
		//else if(head==tail)
			
		else {
			newnode.next=head;
			head=newnode;
		}
		
	}
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty())
			head=tail=newnode;
		else if(head.next==null) {
			head.next=newnode;
		tail=newnode;
		}
		else {
			Node trav=head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=newnode;
			tail=newnode;
		}
	}
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else {
			head=head.next;
		}
	}
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else {
			Node trav=head;
			while(trav.next.next!=null) {
				trav=trav.next;
			}
			trav.next=null;
			tail=trav;
		}
	}
	
	public void display(){
		if(isEmpty())
			return;
		else {
			Node trav=head;
			do {
				System.out.print(" "+trav.data);
				trav=trav.next;
			}while(trav!=null);
			System.out.println("  ");
			System.out.println("tail="+tail.data);
		}
	}
}
public class A4_Q1 {

	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst(44);
		l1.addFirst(33);
		l1.addFirst(22);
		l1.addFirst(11);
		l1.display();
		l1.addLast(55);
		l1.display();
		//l1.deleteFirst();
		l1.deleteLast();
		l1.display();

	}

}
