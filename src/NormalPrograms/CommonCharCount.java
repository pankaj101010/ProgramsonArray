package NormalPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonCharCount {
	public static int commonCharacterCount(String s1, String s2) {
		String[] fors1 = s1.split("");
		String[] fors2 = s2.split("");
		int count = 0;
		Arrays.sort(fors1);
		Arrays.sort(fors2);
		ArrayList<String> A = new ArrayList<String>();
		for (int i = 0; i < fors2.length; i++) {
			A.add(fors2[i]);
		}
		for (int i = 0; i < fors1.length; i++) {
			for (int j = 0; j < A.size(); j++) {
				if (fors1[i].equals(A.get(j))) {
					A.remove(j);
					count++;
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

	}
}
