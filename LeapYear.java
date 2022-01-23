import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = s.nextInt();
		isLeapYear(year);
		s.close();
	}

	public static void isLeapYear(int input) {

		boolean status = false;

		if (input % 4 == 0) {
			if (input % 100 == 0) {
				if (input % 400 == 0)
					status = true;
				else
					status = false;
			} else
				status = true;
		} else
			status = false;

		if (status)
			System.out.print(input + " is a leap year");
		else
			System.out.print(input + " is not a leap year");
	}
}