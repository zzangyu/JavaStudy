package Array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 };
		int[] iArr4 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'A', 'N', 'o', 'I', 'E' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
			System.out.printf(iArr1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
			System.out.printf(iArr2[i] + "\t");
		}
		System.out.println();
//		for (int i = 0; i < 5; i++) {	//·Î¶Ç
//			for (int j = 0; j < iArr2.length; j++) {
//				iArr2[i] = (int) (Math.random() * 45) + 1;
//				System.out.printf(iArr2[i] + "\t");
//			}
//			System.out.println();
//		}
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
		System.out.println(chArr);

	}

}
