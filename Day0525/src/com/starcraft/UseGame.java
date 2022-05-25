package com.starcraft;

public class UseGame {

	public static void main(String[] args) {
		Unit[] u = { new Marine(), new SiegeTank(), new Dropship() };

		for (int i = 0; i < u.length; i++) {
			System.out.println("=================================");
			// 모든 유닛을 같은 위치로 이동시켜라
			u[i].move(100, 200);
			u[i].stop();
			u[i].message();
			System.out.println("=================================");
		}
	}

}
