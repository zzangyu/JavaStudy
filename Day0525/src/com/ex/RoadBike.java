package com.ex;

public class RoadBike extends AbstractBicycle {

	@Override
	void prtInfo() {
		System.out.println("ID: " + id);
		System.out.println("Brand: " + brand);

	}

	private void setId(int y) {
		super.id = y;
	}

	private void setBrand(String x) {
		super.brand = x;
	}

	// 추상 클래스는 일반 메소드 안 써도 됨
	public static void main(String[] args) {
		RoadBike rb = new RoadBike();
		rb.setId(300);
		rb.setBrand("Look");
		rb.prtInfo();

	}

}
