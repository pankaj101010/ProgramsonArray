package NormalPrograms;

public class NumberofConsecutiveNo {
	public static int isSumOfConsecutive2(int n) {
		int sum = 0;
		int count = 0;
		for (int pair = 1; pair < (n / 2) - 1; pair++) {
			for (int i = 1; i <= n / 2; i++) {
				sum += (pair + 1) * i + ((pair + 1) * pair) / 2;
				if (sum == n) {
					count++;
				}
				sum = 0;
			}
		}
		return count;
//		int s = 0;
//		int i = 1;
//		while (++i < n)
//			if (n % ++i < 1)
//				s++;
//		return s;
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(isSumOfConsecutive2(n));
	}
}
