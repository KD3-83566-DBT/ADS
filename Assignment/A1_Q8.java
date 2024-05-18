package Assignment;

import java.util.Scanner;

public class A1_Q8 {
	public static int Rank(int arr[],int N,int key) {
		int rank=0;
		for(int i=0;i<N;i++) {
			if(arr[i]<=key) {
				rank++;
			}
		}
		return rank;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={ 10, 20, 15, 3, 4, 4, 1};
		System.out.println("enter number to find rank of element");
		int key=sc.nextInt();
		int index=Rank(arr, arr.length,key);
		System.out.println("Rank of given number in array= " +index);
	}
}
