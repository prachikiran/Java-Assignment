import java.util.Scanner;

public class DescSortedArray {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter the size of the Array: ");
		int size = s.nextInt();
		int arr[] = new int[size];

		System.out.println("enter elements: ");

		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		sortArray(arr);
	}

	public static void sortArray(int[] array) {

		int size = array.length;
		int extra;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] < array[j]) {
					extra = array[i];
					array[i] = array[j];
					array[j] = extra;
				}
			}
		}

		System.out.println("Sorted array in descending order:");
		for (int i = 0; i < size - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print(array[size - 1]);
	}
}
