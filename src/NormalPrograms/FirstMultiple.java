package NormalPrograms;

public class FirstMultiple {
	public static int firstMultiple2(int[] divisors, int start) {
		for (int i = 0; i < divisors.length;i++) {
			if (start % divisors[i] == 0) {
				return start;
			} 
		}
		return firstMultiple2(divisors, ++start);
	}

	public static void main(String[] args) {
		int[] a = { 5, 6 };
		System.out.println(firstMultiple2(a, 62));
	}
}
