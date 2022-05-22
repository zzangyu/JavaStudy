package 참조자료형;

public class Stirng_substring {

	public static void main(String[] args) {
		String str = "  I wanna Go home";
		int a = 0;
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(5));
		System.out.println(str.substring(5));
		System.out.println(str.substring(2, 7));
		System.out.println(str.substring(2, 6));
		for(;a<str.length();a++) {
			System.out.println(str.charAt(a));
		}
		System.out.println(str.startsWith("i"));
		System.out.println(str.startsWith("I"));
		System.out.println(str.indexOf("n"));
		System.out.println(str.lastIndexOf("n"));
		System.out.println(str.contains("wanna"));
		System.out.println(str.endsWith("go"));
		System.out.println(str.endsWith("home"));
		System.out.println(str.equals("I wanna go home"));
		System.out.println(str.equalsIgnoreCase("I WanNa Go Home"));
		System.out.println(str.isEmpty());
		System.out.println(str.concat(" really"));
		String str2 = str.concat(" really");
		System.out.println(str2); 
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.trim());
	}

}
