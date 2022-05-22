package Array;

/*
배열을 활용하여 최대값 최소값 구하는 방법 !
 */
public class ArrayEx03 {

	public static void main(String[] args) {
		int[] num = { 79, 88, 91, 33, 100, 55, 95 };
		int max = num[0];
		// 배열의 첫번째 값으로 최대값을 초기화한다.
		int min = num[0];
		// 배열의 첫번째 값으로 최소값을 초기화한다.
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
