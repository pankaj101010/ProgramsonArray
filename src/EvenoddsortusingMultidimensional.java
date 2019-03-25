
public class EvenoddsortusingMultidimensional {
	public static void main(String[] args) {
		int[][] evenodd = { { 2, 4, 5, 7, 9 }, { 1, 4, 6, 8, 0 } };
		int temp = 0;
		for (int i = 0; i < evenodd.length; i++) {
			for (int j = 0; j < evenodd[i].length; j++) {
				if (evenodd[0][j] % 2 != 0) {
					for (int k = 0; k < evenodd[1].length; k++) {
						if (evenodd[1][k] % 2 == 0) {
							temp = evenodd[0][k];
							evenodd[0][k] = evenodd[1][k];
							evenodd[1][k] = temp;
							//System.out.print(evenodd[i][j]);
							break;
						}
					}
				}
			}
		}
		for (int i = 0; i < evenodd.length; i++) {
			for (int j = 0; j < evenodd[i].length; j++) {
				System.out.print(evenodd[i][j] + " ");

			}
		}
	}
}
