package review;

import static java.lang.System.out;
import static java.util.Collections.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.Collections;

public class ImportsRunner {

	public static void main(String[] args) {
		String str = " ";
		// String class�� java.lang�� �ִ�. java.lang�� �⺻���� import�� �� �κ��̴�.
		// import�� �������� �ʾƵ� ��� �����ϴ�.

		BigDecimal bd = null;
		// BigDecimal�� java.math��� ��Ű�� �ȿ� �����ϱ� ������ ������ ������ �����.
		// java.math.BigDecimal�� import ���ָ� �ȴ�. java.math.*;�� ���� �ʾ�! �ڼ��ϰ� ����!

		out.println("Static imported");
		// static java.lang.System.out�� import ���༭ System.�� �Ⱥҷ��͵� �ȴ�.

		sort(new ArrayList<String>());
		// ���� �ڵ�: Collections.sort(new ArrayList<String>());
		// sort()�� õ �� ���� ����ϴ� ��쿡 �ſ� �����ϴ�.
	}

}
