package ExceptionHandling;

import java.util.Scanner;

public class FinallyRunnerQuizEx01 {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };

			int number = numbers[5];

//		} catch (Exception e) { catch가 없어도 실행된다 ! (finally가 있으면)
//			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner close"); // 여기에 예외가 생기면 컴파일이 안됨
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("Just before closing out main");
	}

}
