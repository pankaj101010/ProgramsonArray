package NormalPrograms;

public class LeastPrimeDivisor extends GreatestPrimeDivisor {
	public static int leastCommonPrimeDivisor(int a, int b) {
		int min = Math.min(a, b);
		int i = 2;
		while (min >= i) {
			if (isprime(i)) {
				if (a % i == 0 && b % i == 0) {
					return i;
				}
			}
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.print(leastCommonPrimeDivisor(21,35 ));
	}
}
