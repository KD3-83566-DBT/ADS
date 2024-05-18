package Assignment;

import java.util.Arrays;

public class A1_Q9 {
	static int comparisions=0;
	public static int SelectionSort1(int arr[],int N){
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				comparisions++;
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			
		return comparisions;
	}
	public static void main(String[] args) {
		int arr[]= {11,44,88,1,55,22,77,99,66};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		int index=SelectionSort1(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
		System.out.println("number of comparisions= "+index);
	}

}
