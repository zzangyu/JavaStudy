package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx05 {
	public static String getString(String str) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + " !!?!?!?!? ");
		String name = br.readLine();
		return name;
	}

	public static void main(String[] args) throws IOException {
		String name = getString("��.. ������..!");
		System.out.println(name + "�� �ȳ��ϼ���.");

	}

}
