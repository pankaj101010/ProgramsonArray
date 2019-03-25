package NormalPrograms;

import java.util.Arrays;

public class FirstDuplicateaskedinGoogle {
	public static int firstDuplicate(int[] a) {
		int temp = 0;
		int[] dup = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					dup[k] = j;
					k++;
					break;
				}
			}
		}
		Arrays.sort(dup);
		for (int i = 0; i < dup.length; i++) {
			if (dup[i] != 0) {
				temp = dup[i];
				break;
			}
		}
		if (temp == 0)
			return -1;
		else {
			return a[temp];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 5, 3, 2 };
		System.out.println(firstDuplicate(arr));
	}
}
