package study;

/*
 * �ƽ�Ű�ڵ� �ڵ� �� �Է� �ޱ� (�ƽ�Ű�ڵ� = ����)
 * 
 *  0 ~ 9: 48 ~ 57
 *  A ~ Z: 65 ~ 90
 *  a ~ z: 97 ~ 122
 */
import java.io.IOException;// ��� �߰� �ؾ���
public class InputEx01_InputASCIICode {

	public static void main(String[] args) throws IOException { // throws IOExeption ���ܸ� �˾Ƽ� ó���ض�.
		
		//try {  �� throws IOExeption�� �Ⱦ��� try �̰� ����.
		System.out.print("���� �Է�:");
		int i = System.in.read();
		System.out.print("ASCII Code ��"+i);
		//}catch(IOExeption e) {
		//	e.printStackTrace();
		//}
		
		}
	}
