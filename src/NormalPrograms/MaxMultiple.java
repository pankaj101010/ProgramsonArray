package NormalPrograms;

public class MaxMultiple {

	public static int maxMultiple(int divisor, int bound) {
		int count = 1;
		while (divisor > 0) {
			int N = divisor * count;
			if (N % divisor == 0 && N <= bound && N > 0) {
				return N;
			} else {
				count++;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

	}
}
