import java.util.Scanner;
public class ReverseString {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string to check: ");
	        String input = sc.next();
	        reversefunction(input);
	        sc.close();
	    }

	    public static void reversefunction(String stringValue) {

	        String original = stringValue;
	        String reverse = "";
	        int length = stringValue.length();

	        for(int i=length-1 ;i>=0; i--) {
	            reverse = reverse + stringValue.charAt(i);
	        }
	        System.out.println("The reversed string is: " + reverse);
}
}
