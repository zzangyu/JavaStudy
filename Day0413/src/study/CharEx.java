package study;

import java.util.Scanner; //ctrl shift o

/*
 *  char: 2byte
 *  	아스키 코드: 1바이트 문자를 표현, 0~255 문자 범위
 *  	유니 코드: 2바이트를 표현, 0~65535 문자 범위 
 * 		https://www.unicode.org/charts/PDF/UFF00.pdf 유니 코드 표, 자바 책 p60 참조
 * 
 * 
 * 	int+short를 short에 담을 때 2byte를 날리고 넣는다. ▶ 강제형변환, 명시적형변환. 수치를 버려야된다!
 * 
 * 
 */

public class CharEx {

	public static void main(String[] args) {
		//싱글쿼터 사용 '' 
		
		Scanner sc = new Scanner(System.in);
		
		char ch1 = 'A';
		char ch2 = '\u0041'; //원래 에러가 나야되는데 써서 안나는것임. 역슬레시u를 사용(유니코드) 
		
		System.out.println((int)(ch1));
		System.out.println((int)(ch2));
		System.out.println(ch1+ch2);
		System.out.println((char)(ch1+ch2));
		
		System.out.println("문자 입력");
		String str = sc.next();
		System.out.println(str);
		
		
		
		
		
		
	}

}
