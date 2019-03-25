package NormalPrograms;

import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.sampled.ReverbType;

public class PossibilityPallindrome {
//	public static String uniqueCharacters(String test) {
//		String temp = "";
//		for (int i = 0; i < test.length(); i++) {
//			if (temp.indexOf(test.charAt(i)) == -1) {
//				temp = temp + test.charAt(i);
//			}
//		}
//		return temp;
//	}
	
	/**
	 * @author Shashank
	 * @param Any input String for checking possibility whether it can be rearranged to form a palindrome or not 
	 * @return Boolean true or false.
	 * @category Checking possibility of finding a Palindrome
	 */

	public static boolean palindromeRearranging(String a) {
		if (a.length() <= 1)
			return true;
		else {
			ArrayList A = new ArrayList();
			char[] res = a.toCharArray();
			Arrays.sort(res);
			for (int i = 0; i < res.length; i++) {
				A.add(res[i]);
			}
			for (int i = 0; i < A.size() - 1;) {
				if (A.get(i).equals(A.get(i + 1))) {
					A.remove(i + 1);
					A.remove(i);
				} else {
					i++;
				}
			}
			return A.size() <= 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(palindromeRearranging("baddabcad"));
	}
}
