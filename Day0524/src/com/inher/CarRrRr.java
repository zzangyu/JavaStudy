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
	private int distance = 0;
	private int battery = 100;

	public ECar() {

	}

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

	public static ECar getInstance() {
		return new ECar();
	}
}

public class CarRrRr {

	public static void main(String[] args) {
		ECar car = ECar.getInstance();
		car.drive();
		car.drive();
		car.drive();
		car.dispBattery();
		car.dispDistance();
	}

}
