package Array_ArrayList;

import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		int[] marks = new int[5];
		System.out.println(Arrays.toString(marks));
		Arrays.fill(marks, 100); // �迭�� �ν��Ͻ����� �� 100���� �ٲ���
		System.out.println(Arrays.toString(marks));
		
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		int[] array3 = {3, 2, 3};
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
		// Arrays.equals = ��!
	}

}
