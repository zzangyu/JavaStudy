package HelloWorld;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');
		System.out.println("알파벳인가요?"+myChar.isAlphabet());
		System.out.println("모음인가요?"+myChar.isVowel()); //모음
		System.out.println("자음인가요?"+myChar.isConsonant()); // 자음
		System.out.println("0~9 사이인가요?"+myChar.isDigit());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
