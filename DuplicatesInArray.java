import java.util.Scanner;

public class DuplicatesInArray {

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
		removeDuplicates(arr);
	}

	public static void removeDuplicates(int[] array) {

		System.out.print("Duplicate elements in the given array:");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);
				}
			}
		}
		System.out.print("\nAfter removing duplicates: ");
		int extra = 0;
		array[extra] = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[extra] != array[i]) {
				extra++;
				array[extra] = array[i];
			}
		}
		for (int i = 0; i <= extra; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}