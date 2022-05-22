package study;
/*
1. 년도가 4로 나누어 떨어지는 해 = 윤년
2. 그 중에서 100으로 나누어 떨어지는 해 = 평년
3. 다만 400으로 나누어 떨어지는 해 = 윤년
- 1년의 평균 날짜는 365.2425일
- 실제 1년보다 0.0003일이 길다.
 */
import java.io.*;

public class 윤년평년_선생님풀이_switchcase {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year, month;
		int day = 0;
		String s = "";
		
		System.out.print("년도를 입력 하세요: ");
		year = Integer.parseInt(br.readLine());
		System.out.print("월을 입력 하세요: ");
		month = Integer.parseInt(br.readLine());
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			s = (year%4==0&&year%100!=0||year%400==0)?"윤년":"평년";
			day = 31;
			System.out.println(year+"년은 "+s+"이고, "+day+"일까지 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			s = (year%4==0&&year%100!=0||year%400==0)?"윤년":"평년";
			day = 30;
			System.out.println(year+"년은 "+s+"이고, "+day+"일까지 입니다.");
			break;
		case 2:
			s = (year%4==0&&year%100!=0||year%400==0)?"윤년":"평년";
			day = (year%4==0&&year%100!=0||year%400==0)? 29 : 28 ;
			System.out.println(year+"년은 "+s+"이고, "+day+"일까지 입니다.");
			break;
		default :
			System.out.println("다시 입력해주세요!!!");
			break;
		}
		

	}

}