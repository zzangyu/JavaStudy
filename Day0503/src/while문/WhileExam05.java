package while문;
/*
[문제]
콜라, 사이다, 마운틴, 초코송이, 에이스, 웨하스가 나오는 자판기 프로그램을 구현하시오.
단, 0을 입력하면 종료
 */
import java.util.Scanner;
public class WhileExam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select=1;
		String str = " ";
		while(select != 0) {
		System.out.println("'1 - 콜라, 2 - 사이다, 3 - 마운틴, 4 - 초코송이, 5 - 에이스, 6 - 웨하스, 0 - 고르지마' 이렇게 있는데 뭐 먹을랭?");
		select = sc.nextInt();
		
		switch (select) {
		case 1:	str = "콜라"; 	break;
		case 2:	str = "사이다";	break;
		case 3:	str = "마운틴";	break;
		case 4:	str = "초코송이";	break;
		case 5:	str = "에이스";	break;
		case 6:	str = "웨하스";	break;
		case 0:	str = "똥";	break;

		default:
			str = "없어요! 다시 입력해줘용~!";
			break;
		}
		System.out.println(str+"을(를) 선택하셨습니당");
		
		
		}
	}
	

}
