package com.inter;

import com.inter.ex.Inter1;
import com.inter.ex.Inter2;
import com.inter.ex.Inter3;

public class InterfaceEx02 implements Inter3 {

	public static void main(String[] args) {
		InterfaceEx02 it = new InterfaceEx02();

		Inter1 it1 = new InterfaceEx02(); // 다형성 - 부모가 생성할 수 없으니까 자식을 이용 !
//		Inter1 it1 = it;
		Inter2 it2 = new InterfaceEx02();
//		Inter2 it2 = it;
		Inter3 it3 = new InterfaceEx02();
//		Inter3 it3 = it;
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getA());
		System.out.println(it3.getData());

		System.out.println(it instanceof Object);
		System.out.println(it instanceof Inter1);
		System.out.println(it instanceof Inter2);
		System.out.println(it instanceof Inter3);
		System.out.println(it instanceof InterfaceEx02);
	}

	int a = 100;

	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a + 10;
	}

}
