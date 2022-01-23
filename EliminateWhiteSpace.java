import java.util.Scanner;

public class EliminateWhiteSpace {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = s.nextLine();
		removeWhiteSpace(str);
		s.close();
	}

	public static void removeWhiteSpace(String string) {

		char[] array = string.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			if ((array[i] != ' ') && (array[i] != '\t')) {
				stringBuffer.append(array[i]);
			}
		}
		String stringWithoutSpace = stringBuffer.toString();
		System.out.println("String after removing all the white space: " + stringWithoutSpace);

	}
}