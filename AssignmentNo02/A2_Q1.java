package AssignmentNo02;

import java.util.Arrays;

public class A2_Q1 {
	public static void InsertionSort(int arr[], int N) {
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };

		System.out.println("Before sort array : " + Arrays.toString(arr));
		InsertionSort(arr, arr.length);
		System.out.println("After sort array : " + Arrays.toString(arr));
	}

}
