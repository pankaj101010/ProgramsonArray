package NormalPrograms;

public class PascalTriange {
//	public static int[] printingNum(int[] a) {
//		int []q=new int[n];
//		if (n == 5)
//			return q;
//		else if(n==1)
//		{
//			return a;
//		}
//		else if(n==2)
//		{
//			q[0] = 1;
//			q[a.length - 1] = 1;
//		}
//		else {
//			q[0] = 1;
//			q[a.length - 1] = 1;
//			for (int i = 1; i < q.length - 2; i++) {
//				q[i] += q[i - 1];
//			}
//		}
//		return printingNum(q, n++);
//	}

	public static void main(String[] args) {
		int n = 5;
		// Printing Lines
		for (int i = 0; i < n; i++) {
			// Printing Spaces and required pyramid
			for (int j = 1; j < (n - i); j++) {
				System.out.print(" ");
			}
			int[] p = { 1 };
			//printingNum(p, 1);
//			String A = Integer.toString((int) Math.pow(11, i));
//			char[] res = A.toCharArray();
//			for (int j = 0; j < res.length; j++) {
//				System.out.print(res[j] + " ");
//			}
			System.out.println();
		}
	}
}
