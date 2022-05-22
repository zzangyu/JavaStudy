package study;

/*
문자열 입력 받는 법
InputString이 만들어져야 된다. String은 통로 - 이거 아닐수도있음 ㅋㅋ;
BufferedReader - 엔터를 치기 전까지 임시기억공간에 저장되는 것이다.  엔터치면 시스템 쪽으로 들어온다.
 */

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.*; // 위에 세개 포함하는 코드, 위에 세개 다 쓰던가 이거 쓰던가
public class InputEx04_InputASCIICode {

	public static void main(String[] args) throws IOException{
	
		String name , age, addr, tel;
		
		//InputStreamReader is = new InputStreamReader(System.in));
		//BufferedReader bb = new BufferedReader(is); 밑 코드랑 같은건데 분리해놓은것이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름: ");
		name = br.readLine(); //엔터를 치기전 Line 문자를 
		
		System.out.print("나이: ");
		age = br.readLine();
		
		System.out.print("주소: ");
		addr = br.readLine();
		
		System.out.print("전화번호: ");
		tel = br.readLine();
		
		
	}

}
