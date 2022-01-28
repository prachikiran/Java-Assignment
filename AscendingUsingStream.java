import java.util.List;
import java.util.Arrays;

public class AscendingUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(38, 12, 78, 92, 55, 61, 46, 11, 83, 99);

		System.out.println("Sorted list in Ascending Order: ");

		list.stream()
			.sorted()
			.forEach(System.out::println);
	}
}
