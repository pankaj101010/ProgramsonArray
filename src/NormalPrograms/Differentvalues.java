package NormalPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Differentvalues {
	public static int differentValues(int[] a, int d) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					A.add(a[i] - a[j]);
				}
			}
		}
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) <= d)
				B.add(A.get(i));
		}
		int max = Collections.max(B);

		if (max <= d ) {
			return max;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 3, 7 };
		System.out.println(differentValues(a, 3));
	}
}
