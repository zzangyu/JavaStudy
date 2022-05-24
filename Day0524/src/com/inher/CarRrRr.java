package com.inher;

/*
 ���� �ڵ��� Ŭ����
 �ڵ����� ����(100%) ���͸��� ����
 �����Ҷ����� 1km ����, ���͸� 10% �Ҹ�
 2������ �����ִ� ���÷��̰� ����
 ������ �� �Ÿ��� "����Ÿ�: ...km"
 ���� ���͸� �������� "���͸�: ...%"�� ���� ǥ��

 1.ECar.getInstance(): ���ο� �ڵ����� �����ϴ� ���� �޼ҵ�.
 ECar car = ECar.getInstance();
 2. dispDistance();
 3. dispBattery(): ������� ǥ��
 4. drive(): �ѹ� ȣ��� ������ 1km�� ����

 */
class ECar {
	protected int distance = 0;
	protected int battery = 100;

	public void drive() {
		this.distance++;
		this.battery -= 10;
	}

	public void dispBattery() {
		System.out.println("���͸�: " + battery + "%");
	}

	public void dispDistance() {
		System.out.println("����Ÿ�: " + distance + "km");
	}
}

public class CarRrRr {

	public static void main(String[] args) {
		ECar car = new ECar();
		car.drive();
		car.drive();
		car.drive();
		car.dispBattery();
		car.dispDistance();
	}

}
