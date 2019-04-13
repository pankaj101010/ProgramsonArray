package NormalPrograms;

public class ProblemonChars {
	public static void main(String[] args) {
		char[] a = { '6', '7', '8', '9', '0' };
		char b='A';
		//char d=65;
		//This is not allowed
		char e='\u0041';
		//char f=\u0041;
		//This is not allowed
		char g=0124;
		char h=0xEf;
		System.out.println(h);
		int result = 0;
		for (char c : a) {
			result += c - '\u0030';
		}
//		System.out.println(result);
	}
}
