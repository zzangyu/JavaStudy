package com.inner;

/*
 * static Inner Class
 *
 * - static inner class�� ��¿ �� ���� �����ϴ� ��찡 �ִµ�
 *   ��¿ �� ���� �����ϴ� ���� �̳�Ŭ���� ���� static ������ ������ �ִ� ���
 *   ��¿ �� ���� �̳�Ŭ������ static���� �����ؾ���
 *
 *   �̳� Ŭ������ ������� static �� �����ؾ߸� ��
 *
 *   		����)
 *   		class Outer{
 *   			int aa;
 *
 *   			static class Inner{
 *
 *   			static int bb;
 *   			}
 *
 *   		}
 *
 *   	   	Outer.Inner in = new Outer.Inner();
 *   Ȥ��  Outer.Inner in = new Outer.new Inner();
 */
public class StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200;

	static class Inner {
		static int d = 1000;

		public void printData() {
//			System.out.println("int a: " + a); static class�ȿ� ������ ���ϴ� a, b ! static�� static�� ���� �����ϴ�.
//			System.out.println("int b: " + b);
			System.out.println("int c: " + c);
			System.out.println("int d: " + d);
		}

	}

	public static void main(String[] args) {
		StaticInner.Inner si = new StaticInner.Inner();
		si.printData();
	}

}
