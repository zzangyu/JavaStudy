package study;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '��'; //char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
		
	}

}
