package Array;

/*
[����]
������ ���ڰ� ����ִ� �迭�� ���� �����͵� ��
¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ͻÿ�.
1. �迭�� ��ü ��� ���: 4, 7, 9, 1, 3, 2, 5, 6, 8
2. ¦���� ���: 4, 2, 6, 8
3. 3�� ����� ���: 9, 3, 6
 */

public class ArrayEx02 {

	public static void main(String[] args) {

		int arr[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };

		for (int temp : arr) {
			System.out.print(temp + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
