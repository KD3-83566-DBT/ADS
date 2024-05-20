package AssignmentNo05;

//3. Count occurrences of each word in a line/file
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A5_Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String line = scanner.nextLine();

		String[] words = line.split(" ");

		Map<String, Integer> wordCounts = new HashMap<>();

		for (String word : words) {
			if (wordCounts.containsKey(word)) {
				wordCounts.put(word, wordCounts.get(word) + 1);
			} else {
				wordCounts.put(word, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
