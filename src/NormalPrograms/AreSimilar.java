package NormalPrograms;

import java.util.Arrays;

public class AreSimilar {
	public static boolean areSimilar(int[] a, int[] b) {
		if (Arrays.equals(a, b))
			return true;
		int temp = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if (i != j) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					if (Arrays.equals(a, b))
						return true;
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
		int[] b = { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };
		System.out.println(areSimilar(a, b));
	}
}
