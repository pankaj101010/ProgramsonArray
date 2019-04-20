package NormalPrograms;

public class isIsomorphicMatrix {
	public static boolean areIsomorphic(int[][] a, int[][] b) {
		int c = 0;
		int d = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= a[i].length; j++) {
				c++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j <= b[i].length; j++) {
				d++;
			}
		}
		return c == d;
	}

	public static void main(String[] args) {
		int[][] a = { { 2 }, {} };
		int[][] b = { { 2 } };
		System.out.println(areIsomorphic(a, b));
	}
}
