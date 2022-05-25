package com.inher;

public class EECar {

	private int distance = 0;
	private int batteryPercentage = 100;

	public int getDistance() {
		return distance;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void dispBattery() {
		if (this.batteryPercentage == 0) {
			System.out.println("���͸��� ���� �����ϴ�. �����ϼ���.");
			return;
		}
		System.out.println("���͸�: " + batteryPercentage + "%");
	}

	public void dispDistance() {
		System.out.println("����Ÿ�: " + distance + "km");
	}

	public void dispBoth() {
		if (this.batteryPercentage == 0) {
			System.out.println("���͸��� ���� �����ϴ�. �����ϼ���.");
			System.out.println("����Ÿ�: " + distance + "km");
			return;
		}
		System.out.println("���͸�: " + batteryPercentage + "%");
		System.out.println("����Ÿ�: " + distance + "km");
	}

	public void drive(int x) {
		int i = 0;
		while (i < x) {
			if (this.batteryPercentage != 0) {
				this.distance++;
				this.batteryPercentage -= 10;
			} else {
				System.out.println("����� !");
			}
			i++;
		}
	}

	public static EECar getInstance() {
		// ��ü ��ȯ
		return new EECar();
	}

	public static void main(String[] args) {
		EECar car = EECar.getInstance();
		car.drive(8);
		car.dispBoth();
	}

}
