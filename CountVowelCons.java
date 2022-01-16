import java.util.Scanner;

public class CountVowelCons {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the String: ");
		String word = s.nextLine();
		word = word.toLowerCase();
		checkVowelCons(word);
	}

	public static void checkVowelCons(String string) {

		int vowelCount = 0;
		int consoCount = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {

				vowelCount++;
			} else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
				consoCount++;
			}
		}
		System.out.println("Total number of vowels in the string: " + vowelCount);
		System.out.print("Total number of consonant in the string: " + consoCount);
	}
}
