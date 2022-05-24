package com.inher;

/*
 전기 자동차 클래스
 자동차는 완전(100%) 배터리로 시작
 운전할때마다 1km 주행, 배터리 10% 소모
 2가지를 보여주는 디스플레이가 있음
 주행한 총 거리는 "주행거리: ...km"
 남은 배터리 충전량은 "배터리: ...%"와 같이 표시

 1.ECar.getInstance(): 새로운 자동차를 생성하는 정적 메소드.
 ECar car = ECar.getInstance();
 2. dispDistance();
 3. dispBattery(): 백분율로 표시
 4. drive(): 한번 호출될 때마다 1km씩 운행

 */
class ECar {
	protected int distance = 0;
	protected int battery = 100;

	public void drive() {
		this.distance++;
		this.battery -= 10;
	}

	public void dispBattery() {
		System.out.println("배터리: " + battery + "%");
	}

	public void dispDistance() {
		System.out.println("주행거리: " + distance + "km");
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
