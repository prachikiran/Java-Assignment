import java.util.List;
import java.util.Arrays;

public class FirstElementUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(8, 13, 25, 38, 9, 1, 25, 67, 50, 10);

		System.out.println("First Element in the List: ");

		list.stream()
			.findFirst()
			.ifPresent(System.out::println);

	}
}
