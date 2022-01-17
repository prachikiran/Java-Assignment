import java.util.Scanner;

public class MinMaxChar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String sentence = s.nextLine();
		sentence = sentence.toLowerCase();
		checkOccurrence(sentence);
		s.close();
	}

	public static void checkOccurrence(String input) {

		int[] charLength = new int[input.length()];
		char minChar = input.charAt(0);
		char maxChar = input.charAt(0);
		int min, max;
		char string[] = input.toCharArray();
		for (int i = 0; i < string.length; i++) {
			charLength[i] = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					charLength[i]++;

					string[j] = '0';
				}
			}
		}
		min = max = charLength[0];
		for (int i = 0; i < charLength.length; i++) {
			if (min > charLength[i] && charLength[i] != '0') {
				min = charLength[i];
				minChar = string[i];
			}
			if (max < charLength[i]) {
				max = charLength[i];
				maxChar = string[i];
			}
		}
		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);
	}
}
