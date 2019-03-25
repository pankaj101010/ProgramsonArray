package NormalPrograms;

public class DigitDegree {
	public static int performadd(int n) {
		int t = 0;
		if (n < 10)
			return 0;
		while (n > 0) {
			t = t + n % 10;
			n /= 10;
		}
		if (t <= 9)
			return 1;
		else {
			int p=0;
			while(t>0)
			{
				p += t % 10;
				t /= 10;
			}
			if(p>9)
				return 3;
		}
		return 2;
	}
	public static void main(String[] args) {
		System.out.println(performadd(777773));
	}
}
