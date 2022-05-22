package Array;

public class ArrayEx05 {

	public static void main(String[] args) {

		int[] lot = new int[45];

		for (int i = 0; i < lot.length; i++) {
			lot[i] = i + 1;

		}
		int temp = 0;
		int j = 0;
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);
			temp = lot[i];
			lot[i] = lot[j];
			lot[j] = temp;
		}

		for (int i = 0; i < 6; i++) {
			System.out.printf("lot[%d] : %d\n", i, lot[i]);
		}

	}

}
