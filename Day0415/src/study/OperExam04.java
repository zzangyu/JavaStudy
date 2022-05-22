package study;

public class OperExam04 {

/*
    논리연산
    &&(논리곱/and) A,B가 있으면 나올 수 있는 경우의 수는 네 가지 
    ||(논리합/or) 
    !(not) 
 */
	public static void main(String[] args) {
	
		boolean a = false;
		boolean b = false;
		
		if((a = 4>3)||(b = 5>7)) { // 항은 총 3개. (a=4>3), (b=5>7), (a=4>3||b=5>7)
			System.out.println("a = "+a); 
			System.out.println("b = "+b);
			System.out.println(a||b);
		if((a = 4>3)&&(b = 5>7))  //코딩은 틀렸는데 그냥 참고만 하셈
			System.out.println("a = "+a); 
			System.out.println("b = "+b);
			System.out.println(a&&b);
			
			
		
		}
	}

}
