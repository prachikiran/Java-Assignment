import java.util.List;
import java.util.Arrays;

public class BeginWithOne {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(15, 98, 236, 188, 20, 1, 112, 66, 9, 100);
		
		System.out.println("Numbers start with 1 are: ");
		
		list.stream()
			.map(numberString -> numberString + "")
			.filter(numberString -> numberString.startsWith("1"))
			.forEach(display -> System.out.println(display));
	}

}
