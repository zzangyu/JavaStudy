package Array;

public class ArrayEx01 {

	public static void main(String[] args) {

		int[] score = new int[5];
		int j = 1;
		int sum = 0;
		score[0] = 10;
		score[1] = 10;
		score[j + 1 - 1 + 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1] = 10;
		score[j + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 2] = 10;
		score[j + 1 + 1 + 1] = 10;

		for (int i = 0; i < 5; i++) {
			sum += score[i];
		}

		System.out.println(sum);
		System.out.println(score.length);

	}

}
