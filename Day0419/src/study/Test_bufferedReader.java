package study;
/*
 [문제]
 사용자로부터 임의의 정수를 입력받아서 입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 프로그램 구현
 단, 입력은 bufferedReader / if or 삼항연산자 활용
 */

import java.io.*;

public class Test_bufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int a;
		
		System.out.print("정수를 입력하시오.");
		a = Integer.parseInt(br.readLine());
		
		String s ="";
		/*
		if(a>0) {
			s = "양수";
		}else if(a<0) {
			s = "음수";
		}else if(a==0) {
			s = "0";
		}
		System.out.print("입력한 a는 [%s]입니다."+s);
		*/
		
		s = (a< 0)?"음수":((a==0)?"0":"양수");
		
		
		
	}

}
