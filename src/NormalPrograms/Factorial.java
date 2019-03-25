package NormalPrograms;

public class Factorial {
	public static int Fact(int num)
	{
		if(num==1)
			return 1; //Exit Condition for odd series
		else if(num==0)
			return 0;  //Exit Condition for even series
		else
		{
			return num+Fact(num-2);  //Recurrsion method calling its ownself
		}
	}
	
	public static void main(String[] args) {
		int number=9;
		System.out.println(Fact(number));
	}
}
