package com.excp3;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MyException extends Exception {

	// 예외 내용을 저장하는 변수
	private String message;
	// 예외 원인을 Throwable 객체의 형태로 저장
	private Throwable cause;
	// Throwable은 예외하고 에러 모두를 관리 (Exception과 Error의 부모클래스임)

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
		this.message = message;
	}

	public MyException(Throwable cause) {
		super(cause);
		this.cause = cause;
	}

	protected MyException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
		this.cause = cause;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	@Override
	public void printStackTrace() {
		System.out.println("Error 발생 !!");
		System.out.println("Error 원인: " + message);
		System.out.println("관련 class: " + cause);
		System.out.println("Error 정보 끝 !!");

		super.printStackTrace(System.out);

	}

	@Override
	public void printStackTrace(PrintStream out) {
		super.printStackTrace(out);
	}

	@Override
	public void printStackTrace(PrintWriter out) {
		super.printStackTrace(out);
	}

}
