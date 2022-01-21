import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Input the number of rows: ");
		int input = s.nextInt();
		createPascal(input);
		s.close();
	}

	public static void createPascal(int number) {

		for (int edge = 1; edge <= number; edge++) {

			int count = 1;
			for (int index = 1; index <= edge; index++) {

				System.out.print(count + " ");
				count = count * (edge - index) / index;
			}
			System.out.println();
		}
	}
}
