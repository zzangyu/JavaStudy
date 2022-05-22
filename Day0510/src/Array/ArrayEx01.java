package Array;

public class ArrayEx01 {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[10];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		System.out.println("arr[0]: " + arr[0]);
		System.out.println("arr[1]: " + arr[1]);
		System.out.println("arr[2]: " + arr[2]);
		System.out.println("arr[3]: " + arr[3]);

		int i = 0;
		for (int temp : arr) {
			i++;
			System.out.printf("arr[%d]ÀÇ °ªÀº: %d\n", i, temp);
		}

	}

}
