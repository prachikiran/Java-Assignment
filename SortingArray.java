
public class SortingArray {
	
	public static void sortArray(int[] array) {
		
		int extra_variable = 0;
		for(int i=0; i< array.length; i++) {
			if(array[i]>array[i+1]) {
				extra_variable = array[i];
				array[i] = array[i+1];
				array[i+1] = extra_variable;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {8, 9, 5, 2, 15, 2};
		System.out.print("Sorted array in Ascending");
		sortArray(arr);
	}
}
