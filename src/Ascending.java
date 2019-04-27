
public class Ascending {
	public static void main(String[] args) 
	// comment added checked
	{
		int[] arr = { 10, 9, 8, 6, 3, 11, 11, 11, 1, 1, 9, 8, 7 };
		int temp1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp1 = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp1;
					
				}
			}
		}
		/* sorted for descending order */
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				continue;
			else {
				System.out.print(arr[i + 1]);
				break;
			}
		}
	}
}
