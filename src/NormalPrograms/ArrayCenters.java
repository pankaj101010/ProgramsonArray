package NormalPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCenters {
	public static int[] arrayCenter(int[] a) {
		int min = a[0];
		double avg = 0.0;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
			avg += a[i];
		}
		ArrayList A = new ArrayList();

		avg = avg / a.length;
		for (int i = 0; i < a.length; i++) {
			if (a[i] - avg < 0) {
				if ((-1 * (a[i] - avg)) < min) {
					A.add(a[i]);
				}
			} else {
				if ((a[i] - avg) < min) {
					A.add(a[i]);
				}
			}
		}
		int[] k = new int[A.size()];
		for (int i = 0; i < k.length; i++) {
			k[i] = (int) A.get(i);
		}
		return k;
	}

	public static void main(String[] args) {
		int[] a = { 8, 3, 4, 5, 2, 8 };
		for (int i : arrayCenter(a)) {
			System.out.print(i + " ");
		}

	}
}
