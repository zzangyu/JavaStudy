package com.study;

class Person {
	String name;
	int age;
	int weight;
	int height;

	public Person() { // �⺻ ������

	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

}

public class Constructor_Test01 {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("[p1�� ����] �̸�: " + p1.name + ", Ű: " + p1.height + ", ������: " + p1.weight + ", ����: " + p1.age);
		Person p2 = new Person(30);
		System.out.println("[p2�� ����] �̸�: " + p2.name + ", Ű: " + p2.height + ", ������: " + p2.weight + ", ����: " + p2.age);
		Person p3 = new Person("ȫ�浿");
		System.out.println("[p3�� ����] �̸�: " + p3.name + ", Ű: " + p3.height + ", ������: " + p3.weight + ", ����: " + p3.age);

	}

}
