package NormalPrograms;

public class Plant {

	public static int growingPlant(int u, int d, int des) {
		int b = 0;
		int c = 0;
		int day = 0;
		for (day = 1; day <= (des / (u - d)); day++) {
			b += u;
			if (b >= des) {
				break;
			}
			b -= d;
			c = b;
			if (c >= des) {
				break;
			}
		}
		return day;
	}

	public static void main(String[] args) {
		System.out.println(growingPlant(100, 10, 910));
	}
}
