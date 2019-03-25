
public class Evenoddsorting {
	public static void main(String[] args) {
		int[] even = { 2, 4, 5, 7, 9 };
		int[] odd = { 1, 4, 6, 8, 0 } ;
		int temp = 0;
		for (int i = 0; i < even.length; i++) {
			if(even[i]%2 !=0) 
			{
				for (int j = 0; j < odd.length; j++) {
					if(odd[j]%2==0)
					{
						temp=even[i];
						even[i]=odd[j];
						odd[j]=temp;
						break;
					}
				}
			}
		}
		for (int i = 0; i < odd.length; i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < odd.length; i++) {
			System.out.print(odd[i]+" ");
		}
	}
}
