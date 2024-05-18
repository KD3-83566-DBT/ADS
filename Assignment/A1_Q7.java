package Assignment;

import java.util.Scanner;

public class A1_Q7 {
	public static int  NonRepeatingElement(int arr[], int N){
		int count=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
			if(arr[i]==arr[j])
				count++;
			}
		}
		return count;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		int index=NonRepeatingElement(arr, arr.length);
		System.out.println("Number Non Repeating Element is= " +index);
	}

}
