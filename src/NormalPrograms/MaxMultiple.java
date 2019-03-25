package NormalPrograms;

public class MaxMultiple {

	public static int maxMultiple(int divisor, int bound) {
		for (int i = bound; i >= 0; i--) {
			if(i%divisor==0)
			{
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(maxMultiple(3, 10));
	}
}
