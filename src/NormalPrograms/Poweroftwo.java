package NormalPrograms;

public class Poweroftwo {

	public static int[] powersOfTwo(int n) {
		int sum = 0;
		int count = 0;
		int c = 0;
		if (n % 2 == 0) {
			for (int i = 1; i < n; i++) {
				sum += (int) Math.pow(2, i);
				count++;
				if (sum == n) {
					int[] k = new int[count];
					int p = 1;
					for (int z = 0; z < k.length; z++) {
						k[z] = (int) Math.pow(2, p);
						p++;
					}
					return k;
				} else if (sum > n) {
					int[] k = new int[1];
					k[0] = n;
					return k;
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				sum += (int) Math.pow(2, i);
				c++;
				if (sum == n) {
					int[] k = new int[c];
					int p = 0;
					for (int z = 0; z < k.length; z++) {
						k[z] = (int) Math.pow(2, p);
						p++;
					}
					return k;
				} else if (sum > n) {
					int[] k = new int[1];
					k[0] = n;
					return k;
				}
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
