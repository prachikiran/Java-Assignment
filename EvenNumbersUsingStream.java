import java.util.List;
import java.util.Arrays;

public class EvenNumbersUsingStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(19,90,15,84,25,45,28,95,10,12);
		
		System.out.println("Even numbers from the list are: ");
		
		list.stream()
			.filter(integer -> integer % 2 == 0)
			.forEach(System.out::println);
	}
}
