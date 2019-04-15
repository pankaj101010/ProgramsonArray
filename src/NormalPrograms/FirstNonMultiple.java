package NormalPrograms;

public class FirstNonMultiple {
	public static int firstMultiple2(int[] divisors, int start) {
		for (int i = 0; i < divisors.length; i++) {
			if (start % divisors[i] == 0) {
				return firstMultiple2(divisors, ++start);
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4 };
		System.out.println(firstMultiple2(a, 14));
	}
}
