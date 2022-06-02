package com.excp1;

public class ArrayException {

	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 0;

		for (int i = 0; i < intArray.length; i++) {
			try {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "] :" + intArray[i]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 범위 넘으면 다메다메~다메요~");
			}
		}

	}

}
