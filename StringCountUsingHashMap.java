import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class StringCountUsingHashMap {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String input = s.nextLine();
		countUsingHashMap(input);
		s.close();
	}

	public static void countUsingHashMap(String string) {

		Map<String, Integer> hashMap = new HashMap<>();

		String[] charArray = string.split("[, . ' ;]+");

		for (String count : charArray) {

			if (hashMap.containsKey(count)) {
				hashMap.put(count, hashMap.get(count) + 1);
			} else {
				hashMap.put(count, 1);
			}
		}
		System.out.println(hashMap);
	}
}