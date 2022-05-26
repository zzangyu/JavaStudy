package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner { // write�� �ſ� ���� read�� �ſ� ���� ��� ȿ����

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// add Threads�� 3����� ����
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// list.get() Threads�� 10000����� ����
		for (String element : list) {
			System.out.println(element);
		}

		// ���� �� class������ method���� ���� ����ȭ �� ��� 10000���� thread�� �ʹ� ū ����
		// ���⼭ CopyOnWriteArrayList�� add �����ڸ��� ����ȭ���ִ� ����o
		// get ������ ����ȭ ���ϴ� ����: add ������ ���� ��ü array�� �����ؼ� �����ϴ� ���
		// �׷��� �����ϴ� �������� �ٸ� thread���� ������ array ���� ��� �о�� �� �ִ�.
		// ������ �����ϴ� ���� ������ array�� ���ο� array�� ��ü�Ǵ°� ������ �Ǿ� add�� ������ ��

	}

}
