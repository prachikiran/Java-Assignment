import java.util.Scanner;
public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = s.nextInt();
		System.out.println("The FizzBuzz numbers under the range of " + n +": ");
		
		for(int i=1; i<=n; i++) {
			if((i%3 == 0) && (i%5 == 0)) {
				System.out.print("FizzBuzz");
				}
				else if(i%3 == 0) {
					System.out.print("Fizz");
				}
				else if(i%5 == 0) {
					System.out.print("Buzz");
				}
				else {
					System.out.print(i);
				}
				System.out.print(" ");
			}
			s.close();
		}
	}