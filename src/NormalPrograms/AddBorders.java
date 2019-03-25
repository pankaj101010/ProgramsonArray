package NormalPrograms;

public class AddBorders {
	public static String[] addBorder(String[] p) {
		String[] res = new String[p.length + 2];
		int k = 0;
		for (int i = 0; i < res.length; i++) {
			res[i] = "";
		}
		int strlen = p[0].length();
		for (int i = 1; i < res.length - 1; i++) {
			res[i] = p[k];
			k++;
		}
		for (int i = 0; i < strlen + 2; i++) {
			res[0] += "*";
			res[p.length + 1] += "*";
		}
		for (int i = 1; i < res.length-1; i++) {
			String temp = "*";
					res[i] = res[i].concat("*");
					temp = temp.concat(res[i]);
					res[i] = temp;
		}
		return res;
	}

	public static void main(String[] args) {
		String[] p = { "a" };
		for (String i : addBorder(p)) {
			System.out.println(i);
			//System.out.println();
			//System.out.println();
			//System.out.println();
			
		}
	}
}