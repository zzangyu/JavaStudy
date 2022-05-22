package study;
/*
[문제]
임의의 년도를 입력받아서 입력받은 년도가 윤년인지 평년이지를 판정하는 프로그램 구현
입력은 BufferedReader
if or 삼항연산자 활용 중첩을 쓰면 됨
윤년판정 조건
-년도가 4의 배수이면서 100의 배수가 아니거나
 400의 배수이면 윤년 그렇지 않으면 평년

 */
import java.io.*;
public class Test_BufferedReader02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		String s = "";
		
		System.out.print("년도를 입력 하세요: ");
		year = Integer.parseInt(br.readLine());
		
		if(year%4==0&&year%100!=0||year%400==0) {
			s = "윤년";
		}else {
				s = "평년";
		}
		System.out.printf("%d년도는 %s입니다.", year, s);
		
	}

}
/*
[삼항연산자 답]
s=((year%4==0)&&(year%100!=0)||(year%400==0))?"윤년":"평년";
System.out.println(year+"==>"+s);
*/