package NormalPrograms;

public class Horsegame {
	public static void main(String[] args) {

		class Horse {
			public String name;

			public Horse(String s) {
				name = s;
			}
		}
		Horse obj = new Horse("ABC");
		System.out.print(obj.name);
	}
}