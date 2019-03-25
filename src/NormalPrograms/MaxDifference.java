package NormalPrograms;

import java.util.Arrays;

public class MaxDifference {
	public static int arrayMaximalAdjacentDifference(int[] k) {
		int []p=new int[k.length-1];
		int g=0;
	    for(int i=0;i<k.length-1;i++)
	    {
	        int maxdif=0;
	        p[g]=k[i]-k[i+1];
	        if(p[g] <=0)
            {
	        	p[g]= -1 * p[g];
             }
	        g++;
	    }
	    Arrays.sort(p);
	    return p[p.length-1];
	}

	
	public static void main(String[] args) {
	int []a= {2, 4, 1, 0};
	System.out.println(arrayMaximalAdjacentDifference(a));
	}
}
