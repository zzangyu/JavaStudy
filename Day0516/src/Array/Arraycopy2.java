package Array;

public class Arraycopy2 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int[] temp = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
			System.out.print(temp[i] + "\t");

		}
		System.out.println();
		arr = temp;
		System.out.println("���� �� .. arr.length: " + arr.length);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
