import java.util.Map;
import java.util.HashMap;

public class IterateHashMap {

	public static void main(String[] args) {
		Map<String, String> capitals = new HashMap<String, String>();

		capitals.put("Maharashtra", "Mumbai");
		capitals.put("Gujarat", "Gandhinagar");
		capitals.put("Bihar", "Patna");
		capitals.put("Karnataka", "Bangalore");
		capitals.put("Rajasthan", "Jaipur");

		for (Map.Entry<String, String> entry : capitals.entrySet()) {
			String state = entry.getKey();
			String capital = entry.getValue();
			System.out.println("State: " + state + ", Capital: " + capital);
		}

	}
}