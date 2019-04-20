package NormalPrograms;

public class Poweroftwo {

	public static int[] powersOfTwo(int n) {
		int sum = 0;
		int count = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum += (int) Math.pow(2, i) + (int) Math.pow(2, j);
				if (sum > n)
					break;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		for (int i : powersOfTwo(7)) {
			System.out.print(i + " ");
		}
	}
}
