package NormalPrograms;

public class Poweroftwo {
	public static int[] powersOfTwo(int n) {
		int[] k = new int[2];
		for (int i = 0; i < n/2; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.pow(2, i) + Math.pow(2, j) == n) {
					k[0] = (int) Math.pow(2, i);
					k[1] = (int) Math.pow(2, j);
					break;
				}
			}
		}
		return k;
	}

	public static void main(String[] args) {
		for (int i : powersOfTwo(10)) {
			System.out.print(i + " ");
		}
	}
}
