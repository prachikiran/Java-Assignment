import java.util.Scanner;

public class TotalCount {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String word = s.nextLine();
		s.close();
		stringCount(word);
	}

	public static void stringCount(String string) {

		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}
		System.out.println(
				"Total number of characters in the given string, " + string + ": " + count);
	}
}
