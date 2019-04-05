package NormalPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class DigitDifferenceSort {
//	For index wise sorting in descending order
	public static int[] sortingnumberindexwise(int[] a, ArrayList<Integer> index) {
		int k = 0;
		int[] res = new int[index.size()];
		int[] finalres = new int[index.size()];
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < index.size(); j++) {
				if (a[i] == (int) index.get(j)) {
					res[k] = i;
					index.remove(j);
					k++;
					break;
				}
			}
		}
		int g = 0;
		k = 0;
		for (int i = 0; i < res.length; i++) {
			finalres[g] = a[res[k]];
			g++;
			k++;
		}

		return finalres;
	}

	public static int[] finddigitDifferenceandSort(int[] p) {
		int[] finres = new int[p.length];
		for (int i = 0; i < finres.length; i++) {
			finres[i] = p[i];
		}
		// This finres array act as an temp array and reused to make final result array
		int digit = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; i++) {
			B.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < p.length; i++) {
			int temp = 0;
			temp = p[i];
			while (p[i] > 0) {
				digit = p[i] % 10;
				p[i] /= 10;
				A.add(digit);
			}
			int b = Collections.max(A);
			int c = Collections.min(A);
			int diff = b - c;
			B.get(diff).add(temp);
			A.clear();
		}
		for (int i = 0; i < B.size(); i++) {
			if (B.get(i).size() > 1) {
				ArrayList<Integer> C = new ArrayList<Integer>();
				for (int k = 0; k < B.get(i).size(); k++) {
					C.add(B.get(i).get(k));
				}
				B.get(i).clear();
				for (int j : sortingnumberindexwise(finres, C)) {
					B.get(i).add(j);
				}
			} else {
				continue;
			}
		}
		int k = 0;
		for (int i = 0; i < B.size(); i++) {
			for (int j = 0; j < B.get(i).size(); j++) {
				if (B.get(i).size() == 0)
					continue;
				else {
					finres[k] = B.get(i).get(j);
					k++;
				}
			}
		}
		return finres;
	}

	public static void main(String[] args) {
		int[] a = {152, 23, 7, 887, 243};
		for (int i : finddigitDifferenceandSort(a)) {
			System.out.print(i + " ");
		}
	}
}
