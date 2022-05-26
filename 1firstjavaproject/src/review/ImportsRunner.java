package review;

import static java.lang.System.out;
import static java.util.Collections.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.Collections;

public class ImportsRunner {

	public static void main(String[] args) {
		String str = " ";
		// String class는 java.lang에 있다. java.lang은 기본적인 import의 한 부분이다.
		// import를 진행하지 않아도 사용 가능하다.

		BigDecimal bd = null;
		// BigDecimal은 java.math라는 패키지 안에 존재하기 때문에 컴파일 오류가 생긴다.
		// java.math.BigDecimal을 import 해주면 된다. java.math.*;는 좋지 않아! 자세하게 적어!

		out.println("Static imported");
		// static java.lang.System.out을 import 해줘서 System.을 안불러와도 된다.

		sort(new ArrayList<String>());
		// 원래 코드: Collections.sort(new ArrayList<String>());
		// sort()를 천 번 정도 사용하는 경우에 매우 유용하다.
	}

}
