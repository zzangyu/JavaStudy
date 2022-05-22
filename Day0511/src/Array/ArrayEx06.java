package Array;

public class ArrayEx06 {

	public static void main(String[] args) {

		int[] bb = new int[10];

		for (int i = 0; i < bb.length; i++) {
			bb[i] = (int) (Math.random() * 10);
		}
		System.out.println();

		for (int i = 0; i < bb.length - 1; i++) {
			boolean change = false;
			for (int j = 0; j < bb.length - 1 - i; j++) {
				if (bb[j] > bb[j + 1]) {
					int temp = bb[j];
					bb[j] = bb[j + 1];
					bb[j + 1] = temp;
					change = true;
				}
			}
			if (!change) {
				break;
			}
			for (int k = 0; k < 10; k++) {
				System.out.print(bb[k] + " ");
			}
			System.out.println();

		}

	}

}