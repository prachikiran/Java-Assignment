import java.util.Scanner;

public class DuplicateCharacters {
	
	public static void main(String[] args)
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enetr the string: ");
		String string = s.nextLine();
		findDuplicateChar(string);
		s.close();
	}	
	public static void findDuplicateChar(String input) {
		
		int count;
		char[] charString = input.toCharArray();
		for(int i=0; i<charString.length; i++) {
			
			count = 1;
			for(int j=i+1; j<charString.length; j++)
			{
				if(charString[i] == charString[j] && charString[i] != '0') { 
				
				count++;
				charString[j] = '0';
			}
		}
		if(count > 1 && charString[i] != 0)		
			System.out.println("Duplicate characters present in the string: " + charString[i]);
		}
	}
}

