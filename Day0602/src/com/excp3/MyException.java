package com.excp3;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MyException extends Exception {

	// ���� ������ �����ϴ� ����
	private String message;
	// ���� ������ Throwable ��ü�� ���·� ����
	private Throwable cause;
	// Throwable�� �����ϰ� ���� ��θ� ���� (Exception�� Error�� �θ�Ŭ������)

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
		System.out.println("Error �߻� !!");
		System.out.println("Error ����: " + message);
		System.out.println("���� class: " + cause);
		System.out.println("Error ���� �� !!");

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
