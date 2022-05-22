package DoWhile문;
import java.util.Scanner;
public class DoWhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		do {
			System.out.println("첫번째 정수를 입력해주세요.");
			a = sc.nextInt();
			System.out.println("두번째 정수를 입력해주세요.");
			b = sc.nextInt();
			System.out.println("1 - Add, 2 - Subtract, 3 - Divide, 4 - Muliply, 5 - Exit");
			c = sc.nextInt();
			switch (c) {
			case 1: System.out.println(a+b); break;
			case 2: System.out.println(a-b); break;
			case 3: System.out.println(a/b); break;
			case 4: System.out.println(a*b); break;
			case 5:
			}
		}while(c!=5);
		
		
	}

}
