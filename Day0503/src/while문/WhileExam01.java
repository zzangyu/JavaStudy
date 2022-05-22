package while문;

/*
[문제]
사용자가 입력하는 정수를 계속해서 더해 나아감
만약 0이 입력되면 지금까지 입력된 정수의 덧셈 결과를 출력하고 종료함
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExam01 {

	public static void main(String[] args) throws IOException{
		int sum = 0, a = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(a!=0){
			System.out.print("정수를 입력해주세요. - ");
			a = Integer.parseInt(br.readLine());
			sum += a;
		
		}System.out.println("0 입력해서 끝났어! 합은 "+sum);
		
		
		
	}

}
