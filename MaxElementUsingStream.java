import java.util.List;
import java.util.Arrays;

public class MaxElementUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 55, 100, 98, 250, 77, 400, 87, 150, 38);

		System.out.print("Maximum Element in the list: ");

		int maxElement = list.stream()
							 .max(Integer::compare)
							 .get();
		System.out.print(maxElement);
	}
}
