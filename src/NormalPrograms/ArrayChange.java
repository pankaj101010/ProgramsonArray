package NormalPrograms;

public class ArrayChange {
	public static int arrayChange(int[] a) {
		int c = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				continue;
			} else if (a[i] == a[i + 1]) {
				a[i + 1] = a[i] + 1;
				c++;
			} else {
				c += a[i] - a[i + 1] + 1;
				a[i + 1] = a[i] + 1;
			}

		}
		return c;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15 };
		System.out.println(arrayChange(a));
	}
}
