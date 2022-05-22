package Array;

/*
¾ËÆÄºª A to Z
 */
public class ArrayEx04 {
	public static void main(String[] args) {

		char ch[] = new char[26];

		ch[0] = 'A';
		int i = 0;
		int b = 65;

		for (char c : ch) {
			ch[i] = (char) b;
			System.out.printf("%c\t", ch[i]);
			i++;
			b++;
		}
		System.out.println();

		char[] alpha = new char[26];
		for (int k = 0; k < alpha.length; k++) {
			alpha[k] = (char) ('a' + k);
			System.out.printf("%c\t", alpha[k]);
		}

	}
}
