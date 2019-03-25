package NormalPrograms;

import java.util.Scanner;

public class Presentornot {
	public static void main(String[] args) {
	
		int[] a = { 1, 2, 3, 4, 5 };
		Scanner A = new Scanner(System.in);
		System.out.println("Please enter the number to check");
		int p = A.nextInt();
		for (int i = 0; i < a.length;) {
			if (a[i] != p) {
				i++;
				if (i == a.length) {
					System.out.println("Not Contains");
					break;
				}
			} else {
				System.out.println("Contains");
				break;
			}
		}
	}
}
