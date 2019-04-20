package NormalPrograms;

public class CountingNumberofSundays {
	int howManySundays(int n, String day) {
		int count = 1;
		int days = 0;
		if (day.equals("Monday")) {
			count = 6;
		} else if (day.equals("Tuesday")) {
			count = 5;
		} else if (day.equals("Wednesday")) {
			count = 4;
		} else if (day.equals("Thursday")) {
			count = 3;
		} else if (day.equals("Friday")) {
			count = 2;
		} else if (day.equals("Saturday")) {
			count = 1;
		} else {
			count = 7;
			days = n - count;
			if (days < 7) {
				return 0;
			} else {
				return days / 7;
			}
		}
		days = n - count;
		if (days < 0) {
			return 0;
		}
		return (days / 7) + 1;
	}

	public static void main(String[] args) {

	}
}
