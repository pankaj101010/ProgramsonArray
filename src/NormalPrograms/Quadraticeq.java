package NormalPrograms;

public class Quadraticeq {
	public static double[] quadraticEquation(int a, int b, int c) {
		double[] res = new double[2];
		double[] sin = new double[1];
		double[] zero = new double[0];
		if ((Math.pow(b, 2) - 4 * a * c) < 0) {
			return zero;
		} else if ((Math.pow(b, 2) - 4 * a * c) == 0) {
			res[0] = (b * (-1) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			sin[0] = res[0];
			return sin;
		} else {
			res[0] = (b * (-1) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			res[1] = (b * (-1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		}
		return res;
	}

	public static void main(String[] args) {
		for (int i = 0; i < quadraticEquation(2, 2, 0).length; i++) {
			System.out.print(quadraticEquation(2, 2, 0)[i]+ " ");
		}
		
	}
}
