package study;

public class CircleExam {

	public static void main(String[] args) {
	    /*
		* 내 풀이
		*double Area, PI, Around;
		*int r = 5;
		*PI = Math.PI;
		*Area = r*r*PI;
		*Around = r*2*PI;
		
		*System.out.println(Area);
		*System.out.println(Around);
		*/
		
		/*
		 * 1. 변수선언 및 초기화
		 * double area =0;
		 * int r = 5;
		 * 
		 * 2. 연산 및 처리
		 * 	area = r*r*(Math.PI);
		 * 
		 * 3. 출력
		 * System.out.println("원의 넙이는 "+area+"입니다.");
		 * System.out.printf("원의 넓이는 %.3f입니다.", area);
		 */
		
		 double area, around =0;
		 int r = 5;
		 around = r*2* (Math.PI);
		 area = r*r*(Math.PI);
		  
		 System.out.println("원의 넙이는 "+area+"입니다.");
		 System.out.printf("원의 넓이는 %.2f입니다.%n", area); // %n \n이랑 같음
		 System.out.printf("원의 둘레는 %.2f입니다.%n", around);
		
		 
	}

}
