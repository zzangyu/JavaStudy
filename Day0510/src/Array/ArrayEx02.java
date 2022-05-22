package Array;

/*
[문제]
임의의 숫자가 들어있는 배열의 숫자 데이터들 중
짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는 ㅍ로그램을 구현하시오.
1. 배열의 전체 요소 출력: 4, 7, 9, 1, 3, 2, 5, 6, 8
2. 짝수만 출력: 4, 2, 6, 8
3. 3의 배수만 출력: 9, 3, 6
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
