import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of disks: ");
		int disk = s.nextInt();
		moveDisks(disk, 'A', 'C', 'B');
		s.close();
	}

	public static void moveDisks(int number, char source, char auxiliary, char destination) {

		if (number == 0) {
			return;
		}
		moveDisks(number - 1, source, destination, auxiliary);
		System.out.println("Move disk " + number + " from rod " + source + " to " + destination);
		moveDisks(number - 1, auxiliary, source, destination);
	}

}
