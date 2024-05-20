package AssignmentNo05;
class Deque{
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int value){
			data=value;
			next=prev=null; 
		}
	}
	Node head;
	Node tail;
	Deque(){
		head=tail=null;
	}
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	public void addFrist(int value) {
		Node newnode=new Node(value);
		if(isEmpty()){
			head=tail=newnode;
		}
		else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;	
		}	
	}
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty()){
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}
	}
	public int deleteFirst() {
		if(isEmpty()) {
			System.out.println("list is Empty");
			return -1;
		}
		else if(head == tail) {
			int temp=head.data;
			head = tail = null;
			return temp;
		}
			
		else {
			int temp=head.data;
			head.next.prev=null;
			head=head.next;
			return temp;	
		}
	}
	public int deleteLast() {
		if(isEmpty()) {
			System.out.println("list is Empty");
			return -1;
		}
		else if(head == tail) {
			int temp=head.data;
			head = tail = null;
			return temp;
		}
		else {
			int temp=tail.data;
			tail.prev.next=null;
			tail=tail.prev;
			return temp;
		}
	}
	public int peekFrist() {
		if(isEmpty()) {
			System.out.println("list is Empty");
			return -1;
		}
		return head.data;
	}
	
	public int peekLast() {
		if(isEmpty()) {
			System.out.println("list is Empty");
			return -1;
		}
		return tail.data;
	}
}
public class A5_Q2 {

	public static void main(String[] args) {
		Deque d=new Deque();
		d.addFrist(15);
		d.addLast(55);
		System.out.println(""+ d.peekFrist());
		System.out.println(""+ d.peekLast());
		d.deleteFirst();
		d.deleteLast();
		System.out.println(" "+d.peekFrist());
		
	}

}
