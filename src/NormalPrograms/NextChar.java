package NormalPrograms;

public class NextChar {
	public static void main(String[] args) {
		String str = "testing*0";
		StringBuilder result = new StringBuilder();
		char[] strChars = str.toLowerCase().toCharArray();
		for (int i=0;i<strChars.length;i++) {
			if(strChars[i]=='a'|| strChars[i]=='e'|| strChars[i]=='i'|| strChars[i]=='o'|| strChars[i]=='u')
			{
				result.append(strChars[i]++);
			}
			else {
				
			}
		}
		System.out.println(result.toString());
		
//		StringBuilder result = new StringBuilder();
//		char[] strChars = str.toLowerCase().toCharArray();
//		char[] replacements = { 'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r',
//				's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A' };
//		for (int i = 0; i < str.length(); i++) {
//			// result.append(strChars[i] >= 'a' && strChars[i] <= 'z' ?
//			// replacements[strChars[i] - 97] : strChars[i]);
//			if (strChars[i] >= 'a' && strChars[i] <= 'z') {
//				result.append(replacements[strChars[i] - 'a']);
//			} else {
//				result.append(strChars[i]);
//			}
//		}
//		System.out.println(result.toString());
	}
}
