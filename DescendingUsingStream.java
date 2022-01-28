import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class DescendingUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(52, 8, 17, 35, 90, 28, 67, 88, 44, 50);

		System.out.println("Sorted list in Descending Order: ");

		list.stream()
			.sorted(Collections.reverseOrder())
			.forEach(System.out::println);
	}
}
