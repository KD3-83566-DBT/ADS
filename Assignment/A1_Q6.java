package Assignment;
//Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//not found, return -1.

import java.util.Scanner;

public class A1_Q6 {
     public static int occurence(int arr[],int N,int key) {
    	 int counter=0;
    	 for(int i=0;i<N;i++) {
    	 if(key==arr[i])
    		 counter++;
    	 }
    	 if(counter==0)
    		 return -1;
    	 else
    		 return counter;
	}
	public static void main(String[] args) {
		int arr[]={11,22,11,33,22,55,33,33,99,88,99,11};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter key to search number of time occurence ");
		int key=sc.nextInt();
		int index=occurence(arr, arr.length,key);
		if(index!=1){
			System.out.println("key occurence= "+index);
		}
		else {
			System.out.println("kay is not found");
		}

	}

}
