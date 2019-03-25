package NormalPrograms;

public class GreatestPrimeDivisor {
	public static int greatprimedivisor(int a, int b) {
		int min = Math.min(a, b);
		while (min >= 2) {
			if (isprime(min)) {
				if (a % min == 0 && b % min == 0) {
					break;
				}
			}
			min--;
		}
		if (min == 1)
			min = -1;
		return min;
	}

	public static int greatprimedivisor(int a, int b, int c) {
		int min = Math.min(a, b);
		min = Math.min(min, c);
		while (min >= 2) {
			if (isprime(min)) {
				if (a % min == 0 && b % min == 0 && c % min == 0) {
					break;
				}
			}
			min--;
		}
		if (min == 1)
			min = -1;
		return min;
	}

	public static boolean isprime(int c) {
		for (int i = 2; i < c; i++) {
			if (c % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print(greatprimedivisor(27, 35, 85));
	}
}
