package AssignmentNo05;

//4. Calculate the mode of an array. The mode is the element occurred maximum time in the array
public class A5_Q4 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 8, 1, 3, 6, 4, 3, 2, 1, 2,1,1};
		int max = 0, count = 0, var=0;
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}
			if(count>max) {
				max=count;
				var=arr[i];
			}
		}
		System.out.println("maximum fequnt repteted element is: "+ var);
		
	}
}
