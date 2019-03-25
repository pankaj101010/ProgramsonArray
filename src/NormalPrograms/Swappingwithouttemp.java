package NormalPrograms;

public class Swappingwithouttemp {
	public static void main(String[] args) {
		int x=5;
		int y=10;
		System.out.println(x +" "+y);
		/* Now x should be 10 and y should be 5 but without using temp */
		x=x+y;  //x becomes 15
		y=x-y;  //y becomes 5
		x=x-y;  // x becomes 10
		System.out.println(x +" "+y);
	}
}
