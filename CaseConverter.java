import java.util.Scanner;

public class CaseConverter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String word = s.nextLine();
		convertCase(word);
		s.close();
	}

	public static void convertCase(String string) {

		char charString;

		for (int i = 0; i < string.length(); i++) {

			charString = string.charAt(i);
			if (Character.isUpperCase(charString)) {
				System.out.print(Character.toLowerCase(charString));
			} else
				System.out.print(Character.toUpperCase(charString));
		}
	}

}
