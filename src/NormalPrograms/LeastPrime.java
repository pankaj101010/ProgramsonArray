package NormalPrograms;

public class LeastPrime {
	public static int leastCommonPrimeDivisor(int a, int b) {
		int i = 2;
		while (a % i + b % i > 0)
		i += i > a ? ~i : 1;
		return i;

	}

	public static void main(String[] args) {
		System.out.println(leastCommonPrimeDivisor(121,110));
		int i=2;
		System.out.println(~i);
	}
}
