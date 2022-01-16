import java.util.Scanner;

public class WhiteSpace {

	public static int removeWhiteSpace(char[] string) {

		int count = 0;
		for (int i = 0; i < string.length; i++) {
			if (string[i] != ' ')
				string[count++] = string[i];
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		char[] word = s.nextLine().toCharArray();
		s.close();
		int remove = removeWhiteSpace(word);
		System.out.print(String.valueOf(word).subSequence(0, remove));
	}

}
