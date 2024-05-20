package AssignmentNo07;

class Heap1 {
	private int arr[];
	private int SIZE;
	public Heap1(int size) {
		arr = new int[size];
		SIZE = 0;
	}

	public void addHeap(int ele) {
		SIZE++;
		arr[SIZE] = ele;
		int ci = SIZE;
		int pi = ci / 2;
		while (pi >= 1) {
			if (arr[pi] < arr[ci])
				break;
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			ci = pi;
			pi = ci / 2;
		}
	}

	public int deleteHeap() {
		int max = arr[1];		
		arr[1] = arr[SIZE];
		SIZE--;	
		int pi = 1;
		int ci = pi * 2;
		while (ci <= SIZE) {	
			if (ci + 1 <= SIZE && arr[ci + 1] > arr[ci])
				ci = ci + 1;
			if (arr[pi] < arr[ci])
				break;
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			pi = ci;
			ci = pi * 2;
		}
		
		return max;
	}

	public int getMin() {
		return arr[1];
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);	
		}
		System.out.println(" ");
			
	}

}

class PrioritQueue2 {
	private Heap1 h;
	private int SIZE;

	public PrioritQueue2(int size) {
		SIZE = size;
		h = new Heap1(SIZE + 1);
	}

	public void push(int value) {
		h.addHeap(value);
	}

	public int pop() {
		return h.deleteHeap();
	}

	public int peek() {
		return h.getMin();
	}
	public void display() {
		 h.display();
	}
}

public class A7_Q1 {

	public static void main(String[] args) {
		PrioritQueue2 q = new PrioritQueue2(5);

		q.push(6);
		q.push(14);
		q.push(3);
		q.push(26);
        q.display();
		System.out.println("High priority element : " + q.peek());

		q.pop();

		System.out.println("High priority element : " + q.peek());
	}

}

