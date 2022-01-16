import java.util.Scanner;

public class FindDuplicates {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int size = s.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		printDuplicates(arr);
	}

	public static void printDuplicates(int[] array) {

		System.out.print("Duplicate elements in the given array:");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}
}
