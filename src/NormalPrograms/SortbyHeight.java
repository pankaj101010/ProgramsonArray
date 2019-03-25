package NormalPrograms;

public class SortbyHeight {
	public static int[] sortByHeight(int[] a) {
		int[] res = new int[a.length];
		int c = 0;
		for (int i = 0; i < res.length; i++) {
			if (a[i] == -1) {
				res[i] = a[i];
				c++;
			}
		}
//		Asceding sorting
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		if (c == 0)
			return a; // if no -1 found return sorted array as it is
		int g = 0;
		for (g = 0; g < a.length; g++) {
			if (a[g] != -1)
				break;
		}
		for (int i = 0; i < res.length; i++) {
			if (res[i] != -1) {
				res[i] = a[g];
				g++;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		int[] x = { 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1 };
		for (int shashank : sortByHeight(x)) {
			System.out.print(shashank + " ");
		}
	}
}
