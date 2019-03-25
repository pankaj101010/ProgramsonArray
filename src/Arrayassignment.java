
public class Arrayassignment {
	public static void main(String[] args) {
		String[][] names = { { "Vijay", "Ankush", "Sandeep" }, { "Kumar", "Lal", "Gaikwad" } };
//				My Method
// 				for (int j = 0; j < 3; j++) {
//				for (int i = 0; i < names.length; i++) {
//					System.out.print(names[i][j]+" ");
//				}
//				System.out.println();
//			}
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				if (i + 1 < names.length) {
					System.out.println(names[i][j] + " " + names[i + 1][j]);
				}
			}
		}
	}
}
