import java.util.*;
import java.util.regex.*;

public class EmailValidation {

	public static void main(String args[]) {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("javaiscodinglanguage@abc.co.in");
		emails.add("javaiscodinglanguage@.abc.com");
		emails.add("javaiscodinglanguage.name@abc.com");
		emails.add("javaiscoding#abc.co.in");
		emails.add("javaiscodinglanguage@abc.com");
		emails.add("javaiscodinglanguage@abccom");
		emails.add("@googlemail_com");
		emails.add("_javamysql#abc.com");
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches() + "\n");
		}
	}
}