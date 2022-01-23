import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateValidation {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a date in dd/mm/yyyy format: ");
		String date = s.next();

		if (validateDate(date) == true)
			System.out.println("Date is valid");
		else
			System.out.println("Date is invalid");

		s.close();
	}

	private static boolean validateDate(String date) {
		boolean status = false;
		if (verifyDate(date)) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			dateFormat.setLenient(false);
			try {
				dateFormat.parse(date);
				status = true;
			} catch (Exception e) {
				status = false;
			}
		}
		return status;
	}

	static boolean verifyDate(String date) {
		String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
		boolean flag = false;
		if (date.matches(pattern)) {
			flag = true;
		}
		return flag;
	}

}