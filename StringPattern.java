import java.util.Scanner;

public class StringPattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		sc.close();
		char[] array = input.toCharArray();
		
		for(int row=0; row<array.length; row++) {
			for(int col=0; col<=row; col++) {
				System.out.print(array[col]);
				}
			System.out.println("");
			}
		}
	}
