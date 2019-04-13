package NormalPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CheckSameNo {
	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {
		return new HashSet<T>() {
			{
				addAll(a);
				addAll(b);
			}
		};
	}
// For concatenation we can directly put Set<name>.addAll(Set<name>) for set to set concatenation no need of method.
	public static boolean checkSameElementExistence(int[] one, int[] two) {
		Set<Integer> A = new TreeSet<Integer>();
		Set<Integer> B = new TreeSet<Integer>();
		for (int i = 0; i < one.length; i++) {
			A.add(one[i]);
		}
		int c1 = A.size();
		for (int i = 0; i < two.length; i++) {
			B.add(two[i]);
		}
		int c2 = B.size();
		int dist = c1 + c2;
		return mergeSet(A, B).size() != dist;
	}

	public static void main(String[] args) {
		int[] one = { 1, 1, 2 };
		int[] two = { 5, 4, 3 };
		System.out.println(checkSameElementExistence(one, two));
	}
}
