package study;

/*
 * 아스키코드 코드 값 입력 받기 (아스키코드 = 문자)
 * 
 *  0 ~ 9: 48 ~ 57
 *  A ~ Z: 65 ~ 90
 *  a ~ z: 97 ~ 122
 */
import java.io.IOException;// 요놈 추가 해야함
public class InputEx01_InputASCIICode {

	public static void main(String[] args) throws IOException { // throws IOExeption 예외를 알아서 처리해라.
		
		//try {  ◀ throws IOExeption을 안쓸땐 try 이거 쓴다.
		System.out.print("문자 입력:");
		int i = System.in.read();
		System.out.print("ASCII Code 값"+i);
		//}catch(IOExeption e) {
		//	e.printStackTrace();
		//}
		
		}
	}
