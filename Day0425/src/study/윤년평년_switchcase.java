package study;
/*
1. 년도가 4로 나누어 떨어지는 해 = 윤년
2. 그 중에서 100으로 나누어 떨어지는 해 = 평년
3. 다만 400으로 나누어 떨어지는 해 = 윤년
- 1년의 평균 날짜는 365.2425일
- 실제 1년보다 0.0003일이 길다.
- 끝나는 날짜 31, 30, 28이면 평년
- 끝나는 날짜 29면 윤년
 */
import java.util.*;

public class 윤년평년_switchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year, month;
		int day = 0;
		String s = "";
		
		System.out.print("년도를 입력 하세요: ");
		year = sc.nextInt();
		System.out.print("월을 입력 하세요: ");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0) {
				day = 29;
			}else {
				day = 28;
			}
			break;
		default : day = 0;
			break;
		}
		if(day!=0) {
			System.out.println(year+"년 "+month+"월은 "+day+"일까지 입니다.");
		}else {
			System.out.println("입력 오류");
		}
			
		}
		

	}
