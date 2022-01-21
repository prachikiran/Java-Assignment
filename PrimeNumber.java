import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the integer to be checked: ");
		int number = s.nextInt();
		checkPrime(number);
		s.close();
	}

	public static void checkPrime(int value) {

		boolean status = true;
		int var;

		if (value <= 1)
			return;

		for (int index = 2; index <= value / 2; index++) {

			if (value % index == 0) {

				status = false;
				break;
			}
		}
		if (status)
			System.out.print(value + " is a Prime Number");
		else
			System.out.printf(value + " is not a Prime Number");
	}
}