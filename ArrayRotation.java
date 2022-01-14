import java.util.Arrays;

public class ArrayRotation {

	public static void rotateLeft(int array[], int position) {
		int temp;
		System.out.print("Input Array before rotation: ");
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < position; i++) {

			temp = array[0];
			for (int j = 0; j < array.length - 1; j++) {

				array[j] = array[j + 1];
			}
			array[array.length - 1] = temp;
		}

		System.out.print("Array after rotating by " + position + " positions: ");
		System.out.print(Arrays.toString(array));
	}

	public static void main(String[] args) {
		rotateLeft(new int[] { 1, 2, 3, 4, 5, 6 }, 3);
	}
}
