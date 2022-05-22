package study;

/*
[문제]
점수와 학년을 입력받아서 60점 이상이면 합격, 미만이면 불합격
단, 4학년일 경우 70점 이상이어야 합격/ 점수는 65점.
*/


import java.util.*;

public class Test_중첩if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grade, ts;
		
		System.out.print("학년을 입력 하시오.: ");
		grade = sc.nextInt();
		System.out.print("점수를 입력 하시오.: ");
		ts = sc.nextInt();
		
		if( ts >= 60 ) {		
			
			if ( grade == 4){
				
				if( ts>= 70) {
					System.out.println("합격");				
				}else 
					System.out.println("불합격");				
			} else 
				System.out.println("합격");			
		} else {
			System.out.println("불합격");
		}
		
	}

}
