package com.excp2;

public class MemoryException extends Exception {

	public MemoryException(String msg) {
		super(msg);
		System.out.println("메모리가 부족합니다.");
	}
}
