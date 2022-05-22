package Array_ArrayList;

import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		int[] marks = new int[5];
		System.out.println(Arrays.toString(marks));
		Arrays.fill(marks, 100); // 배열의 인스턴스들을 다 100으로 바꿔줌
		System.out.println(Arrays.toString(marks));
		
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		int[] array3 = {3, 2, 3};
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
		// Arrays.equals = 비교!
	}

}
