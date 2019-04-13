package NormalPrograms;

import java.math.BigInteger;

public class ExerciseElaboration {
	public static int exerciseElaboration(int p, int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(p);
		for (int i = 0; i <= n; i++) {
			sb.append('0');
		}
		sb.append(p);
		BigInteger b = new BigInteger(sb.toString());
		String s = b.multiply(b).toString();
		int result = 0;
		for (char c : s.toCharArray()) {
			if (c != '0')
				result += c - '\u0030';
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(exerciseElaboration(9, 10));
	}
}
