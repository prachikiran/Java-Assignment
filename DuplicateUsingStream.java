import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(55, 6, 10, 454, 55, 200, 151, 6, 424, 200, 10, 34, 424);
		Set<Integer> numberSet = new HashSet<Integer>();

		System.out.println("Duplicate Elements in the list: ");

		list.stream()
		.filter(input -> !numberSet.add(input))
		.forEach(System.out::println);

	}
}
