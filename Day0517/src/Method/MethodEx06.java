package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx06 {

	public static int getInt(String str) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + ":");
		int imsi = Integer.parseInt(br.readLine());
		return imsi;
	}

	public static void main(String[] args) throws IOException {
		MethodEx06 me = new MethodEx06();
		int kor = getInt("국어점수");

		System.out.println("당신의 국어점수는 " + kor + "점 입니다.");

	}

}
