package NormalPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MaxDifference {
	public static int arrayMaximalAdjacentDifference(int[] k) {
		List<Integer> A = new LinkedList<Integer>();
		for (int i = 0; i < k.length - 1; i++) {
			for (int j = i + 1; j < k.length; j++) {
				if ((k[i] - k[j]) < 0)
					A.add(-1 * (k[i] - k[j]));
				A.add((k[i] - k[j]));
			}
		}
		Collections.sort(A);
		return A.get(A.size() - 1);
	}

	public static void main(String[] args) {
		int[] a = { 1, -4, 10, -3, 12 };
		System.out.println(arrayMaximalAdjacentDifference(a));
	}
}
