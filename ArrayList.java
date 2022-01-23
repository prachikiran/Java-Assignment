
public class ArrayList {

	public static void main(String[] args) {

		java.util.List<String> list = new java.util.ArrayList<String>();
		list.add("Apple");
		list.add("Papaya");
		list.add("Mango");
		list.add("Banana");
		list.add("Fig");
		list.add("Tangerine");
		list.add("Watermelon");
		list.add("Strawberry");
		list.add("Litchi");
		list.add("PineApple");

		System.out.println("Iterating over the list using for loop: ");

		for (int index = 0; index < list.size(); index++) {

			System.out.println(list.get(index));
		}

		System.out.println("\nIterating over the list using while loop: ");

		int index = 0;
		while (list.size() > index) {
			System.out.println(list.get(index));
			index++;
		}

		System.out.println("\nIterating over the list using for each loop: ");

		for (String var : list) {

			System.out.println(var);
		}
	}
}