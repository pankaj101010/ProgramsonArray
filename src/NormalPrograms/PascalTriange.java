package NormalPrograms;

public class PascalTriange {
	public static void main(String[] args) {
		int n = 5;
		// Printing Lines
		for (int i = 1; i <= n; i++) {
			// Printing Spaces and required pyramid
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			int []a= {1};
			printingnumbers(a,n);
//			String A = Integer.toString((int) Math.pow(11, i));
//			char[] res = A.toCharArray();
//			for (int j = 0; j < res.length; j++) {
//				System.out.print(res[j] + " ");
//			}
			System.out.println();
		}
	}

	private static int [] printingnumbers(int[] a,int n) {
			int []q=new int[0];
			if(n==0)
			{
				return q;
			}
			int [] p= new int[a.length+1];
			int [] temp=new int[a.length+1];
			p[0]=1;
			p[p.length-1]=1;
			temp[0]=1;
			temp[temp.length-1]=1;
			for (int i = 1; i < p.length-1; i++) {
				p[i]=p[i]+p[i-1];
				temp[i]=p[i];
			}
			for (int i = 0; i < temp.length; i++) {
				System.out.print(temp[i]+" ");
			}
		return printingnumbers(p, --n);
		
	}
}
