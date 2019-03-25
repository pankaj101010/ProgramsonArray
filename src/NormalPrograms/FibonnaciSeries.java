package NormalPrograms;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int n = 10;
		int p = 0;
		int q = 1;
		int total = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(p + " ");
			total = p + q; // 1 2 3
			p = q; 		   // 1 1
			q = total;     // 1 2
		}
	}
}
