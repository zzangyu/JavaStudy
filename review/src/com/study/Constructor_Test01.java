package com.study;

class Person {
	String name;
	int age;
	int weight;
	int height;

	public Person() { // 기본 생성자

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
		System.out.println("[p1의 정보] 이름: " + p1.name + ", 키: " + p1.height + ", 몸무게: " + p1.weight + ", 나이: " + p1.age);
		Person p2 = new Person(30);
		System.out.println("[p2의 정보] 이름: " + p2.name + ", 키: " + p2.height + ", 몸무게: " + p2.weight + ", 나이: " + p2.age);
		Person p3 = new Person("홍길동");
		System.out.println("[p3의 정보] 이름: " + p3.name + ", 키: " + p3.height + ", 몸무게: " + p3.weight + ", 나이: " + p3.age);

	}

}
