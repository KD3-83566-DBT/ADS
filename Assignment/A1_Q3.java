package Assignment;

import java.util.Scanner;

public class A1_Q3 {
	static int comparisions;
	public static int  linearSearch(int arr[],int N,int key){
		for(int i=0;i<N;i++) {	
			comparisions++;
		if(key==arr[i]) {
			return i;
		}
		}
		return -1;
	}
	
	public static int binarySerach(int arr[],int N,int key) {
		int left =0,right=N-1,mid;
		comparisions=0;
		while(left<=right) {
			comparisions++;
			mid=(left+right)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid]) {
				right=mid-1;
			}
			else
				left=mid+1;
		}
		return -1;
	}

public static void main(String[] args) {
	int arr[]= {11,22,33,44,55,66};
	Scanner sc =new Scanner(System.in);
	System.out.println("enter key to search");
	int key=sc.nextInt();
	//int index=linearSearch(arr, arr.length,key);
	int index=binarySerach(arr,arr.length, key);
	if(index!=-1){
		System.out.println("Index of Key = "+index+" and number of comparisions= "+ comparisions);
	}
	else {
		System.out.println("kay is not found");
	}
}
}
