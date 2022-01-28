import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.stream.*;
import java.util.function.*;

public class FirstNonRepeatedUsingStream {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String words = s.nextLine();
		findNonRepeated(words);
		s.close();
	}

	public static void findNonRepeated(String string) {

		Character input = string.chars()
				.mapToObj(obj -> Character.toLowerCase(Character.valueOf((char) obj)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
						Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L)
				.map(entry -> entry.getKey()).findFirst().get();
		System.out.print("The first non-repeated character: " + input);
	}
}
