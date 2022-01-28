import java.util.List;
import java.util.Arrays;

public class NumberSumUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(15, 10, 28, 5, 1);

		int sum = list.stream()
				.mapToInt(Integer::intValue)
				.filter(odd -> odd % 2 == 1)
				.sum();

		System.out.print("Sum of all the odd integers in the list: " + sum);

	}
}