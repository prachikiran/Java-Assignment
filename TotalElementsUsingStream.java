import java.util.List;
import java.util.Arrays;

public class TotalElementsUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(8, 10, 25, 42, 1, 88, 20, 9, 72, 7, 4, 55);
		
		System.out.print("Total Elements in the list: ");

		long total = list.stream().count();
		System.out.print(total);
	}
}
