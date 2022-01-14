
public class DuplicateElements {

	public static void printDuplicates(int[] array, int numberOfElements) {
		
		int i;
		int j;
		for (i = 0; i < numberOfElements - 1; i++) {
			for (j = i + 1; j < numberOfElements; j++) {
				if (array[i] == array[j])
					break;
			}
		}
		System.out.print(
				"The duplicate elements present in the given array: " + array[j]);
	}

	public static void main(String[] args) {

		int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
		int lengthOfArray = arr.length;

		printDuplicates(arr, lengthOfArray);
	}
}
