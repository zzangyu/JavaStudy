package com.study.inheritance;

class OverridingParents {
	void parentsMethod() {
		System.out.println("parents Method ,,@");
	}
}

class OverridingChild extends OverridingParents {
	@Override
	void parentsMethod() {
//		super.parentsMethod(); // �θ� method���� ���� ���� ������ !
		System.out.println("child Method ,,@");
	}
}

/*
 * �������̵�(overriding)�� ������ �� �ִ� ��Ģ !
 * 1. �θ�Ŭ������ �ڽ� Ŭ���� ���̿����� �����Ѵ�.
 * 2. static �޼ҵ�� Ŭ������ ���ϴ� method�̱� ������ ���(inheritance) ��ü�� �ȵȴ�.
 * 3. ���� �����ڰ� private�� ���ǵ� method�� ��� ��ü�� �Ұ����ϴ�.
 * 4. interface�� �����ؼ� method�� overriding�� ���� �ݵ�� ���������ڸ� public���� �����ؾ��Ѵ�.
 * 5. �޼ҵ��� ������ ������ Ÿ���� ������ ��ġ�ؾ��ϰ� returnŸ�Ա��� ��ġ�ؾ��Ѵ�.
 * 6. �θ� class�� method�� ���������ں��� �� ������ �� ����. ( ex)�θ� public�ε� �ڽ��� protected�� ��� // public>protected>default>private)
 * 7. �θ� class�� method���� �� ���� ���ܸ� ���� �� ����.
 * 8. final <- ���� ������ �޼ҵ�� �������̵��� �� �� ����.
 */


public class OverridingTest {

	public static void main(String[] args) {
		OverridingChild child = new OverridingChild();
		child.parentsMethod();
	}

}
