package NormalPrograms;

public class SpecialPolynomial {
	public static int specialPolynomial(int x, int n) {
		int sum = 0;
		int i = 0;
		for (i = 0; i < n; i++) {
			sum += (int) Math.pow(x, i);
			if (sum > n) {
				break;
			}
		}

		return i - 1;
	}

	public static void main(String[] args) {
		System.out.println(specialPolynomial(2, 5));
	}
}
