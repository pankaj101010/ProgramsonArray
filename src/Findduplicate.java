import java.util.Scanner;

public class Findduplicate {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner A = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = A.nextInt();
		}
		System.out.println("Duplicate Numbers are");
		for (int i = 0; i < a.length; i++) {
			// int dup=a[0];
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
}
