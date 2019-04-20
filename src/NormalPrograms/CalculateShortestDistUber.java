package NormalPrograms;

public class CalculateShortestDistUber {
	public static double perfectCity(double[] dep, double[] des) {
		double c = Math.abs(Math.floor(dep[0]) - dep[0]);
		double d = Math.abs(Math.floor(des[0]) - des[0]);
		double e = Math.abs(Math.ceil(dep[0]) - dep[0]);
		double f = Math.abs(Math.ceil(des[0]) - des[0]);
		double data = 0.0;
		if ((c + d) < (e + f)) {
			data = c + d;
		} else {
			data = e + f;
		}
		return data + Math.abs(des[1] - dep[1]);
		// double
		// c=Math.abs(Math.floor(dep[0])-dep[0])+Math.abs(Math.floor(des[1])-des[1]);
		// double
		// d=Math.abs(Math.ceil(dep[0])-dep[0])+Math.ceil(Math.floor(des[1])-des[1]);

	}

	public static void main(String[] args) {
		double[] dep = { 2.4, 1 };
		double[] des = { 5, 7.3 };
		System.out.println(perfectCity(dep, des));
	}
}
