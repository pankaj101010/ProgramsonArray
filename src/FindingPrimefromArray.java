
public class FindingPrimefromArray {
	public static void main(String[] args) {
		int[] a = { 4, 6, 8, 7, 9, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j <= a[i]; j++) {
				if (a[i] == j) {
					System.out.println(a[i]);
				}
				if (a[i] % j == 0) {
					break;
				}
			}
		}
	}
}
