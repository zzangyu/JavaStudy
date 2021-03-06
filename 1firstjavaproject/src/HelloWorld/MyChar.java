package HelloWorld;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'i' || ch == 'e' ||
				ch == 'o' || ch == 'u') {
			return true;
		} else if(ch == 'A' || ch == 'I' || ch == 'E' ||
				ch == 'O' || ch == 'U'){
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if(ch >=48 && ch <= 57) {
			return true;
		}
		
		return false;
	}

	public boolean isAlphabet() {
		if((ch >= 65 && ch <= 90 ) || (ch >= 97 && ch <= 122)) {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
//		if((ch >= 65 && ch <= 90 ) || (ch >= 97 && ch <= 122)) {
//			if((ch == 'a' || ch == 'i' || ch == 'e' ||
//				ch == 'o' || ch == 'u')||(ch == 'A' || ch == 'I' || ch == 'E' ||
//				ch == 'O' || ch == 'U')) {
		if(isAlphabet() && !isVowel()) {
				return true;
			}else {
				return false;
			}
		
	}

	public static void printLowerCaseAlphabets() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch+", ");
		}
		System.out.println();
	}

	public static void printUpperCaseAlphabets() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch+", ");
		}
	}

}
