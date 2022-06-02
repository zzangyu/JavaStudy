package com.excp2;

public class SpaceException extends Exception {
	public SpaceException(String msg) {
		super(msg);
		System.out.println("공간이 부족합니다.");
	}
}
