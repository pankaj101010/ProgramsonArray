package NormalPrograms;

import java.util.Scanner;

//eg: 6 is a perfect Number its factors 1,2,3 excluding 6 if added gives 6
public class PerfectNumber {
	public static boolean isPerfectNum(int n) {
		if (n < 2) {
			return false;
		}
		int i = 1;
		int sum = 0;
		while (n > i) {
			if (n % i == 0)
				sum += i;
			i++;
		}
		return sum == n;
	}

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is  perfect or not");
		int n = A.nextInt();
		if (isPerfectNum(n))
			System.out.println("Your number is a perfect");
		else {
			System.out.println("Your number is not perfect");
		}
	}
}
