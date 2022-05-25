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
			System.out.println("배터리가 동이 났습니다. 충전하세요.");
			return;
		}
		System.out.println("배터리: " + batteryPercentage + "%");
	}

	public void dispDistance() {
		System.out.println("주행거리: " + distance + "km");
	}

	public void dispBoth() {
		if (this.batteryPercentage == 0) {
			System.out.println("배터리가 동이 났습니다. 충전하세요.");
			System.out.println("주행거리: " + distance + "km");
			return;
		}
		System.out.println("배터리: " + batteryPercentage + "%");
		System.out.println("주행거리: " + distance + "km");
	}

	public void drive(int x) {
		int i = 0;
		while (i < x) {
			if (this.batteryPercentage != 0) {
				this.distance++;
				this.batteryPercentage -= 10;
			} else {
				System.out.println("멈췄다 !");
			}
			i++;
		}
	}

	public static EECar getInstance() {
		// 객체 반환
		return new EECar();
	}

	public static void main(String[] args) {
		EECar car = EECar.getInstance();
		car.drive(8);
		car.dispBoth();
	}

}
