package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class A1_Q2 {
public static int  linearSearch(int arr[],int N,int key){
	for(int i=N-1;i>=0;i--) {
	if(key==arr[i]) {
		return i;
	}
	}
	return -1;
	
}
	public static void main(String[] args) {
		int arr[]= { 11,22,33,44,44,33,22,11};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter key to search");
		int key=sc.nextInt();
		int index=linearSearch(arr, arr.length,key);
		if(index!=1){
			System.out.println("Index of Key from last= "+index);
		}
		else {
			System.out.println("kay is not found");
		}
		
	}
}
