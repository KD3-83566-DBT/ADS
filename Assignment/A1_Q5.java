package Assignment;

import java.util.Scanner;

public class A1_Q5 {
	public static int BinarySearch1(int []arr,int N,int key) {
		int left=0,right=N-1,mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key<arr[mid]) {
				right=mid+1;
			}
			else {
				left=mid-1;
			}
		}
		return -1;
		
	}
	
public static void main(String[] args) {
	int []arr= {99,88,77,66,55,44,33,22,11};
	Scanner sc= new Scanner(System.in);
	System.out.println("enter key to serch");
	int key=sc.nextInt();
	int index=BinarySearch1(arr, arr.length, key);
	if(index!=-1) {
		System.out.println("element is found at index= "+index);
	}
	else {
		System.out.println("element is not found");
	}
}
}
