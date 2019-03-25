
public class Findduplicatecharfromarray {
	public static boolean isHavingDuplicate(String a) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j))
					count++;
			}
		}
		return count >= 1;
	}

	// Create an array of String and print which has duplicate characters
	public static void main(String[] args) {
		String[][] names = { { "Vijaya", "Ankush", "Sandeep" }, { "Kumar", "Lal", "Gaikwad" } };
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				if (isHavingDuplicate(names[i][j]))
					System.out.println(names[i][j] + " has a duplicate value");
			}
		}
	}
}
