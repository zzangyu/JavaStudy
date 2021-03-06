package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student3 implements Comparable<Student3> {
	private int id;
	private String name;

	public Student3(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(Student3 that) {
		return Integer.compare(that.id, this.id);

	}

}

public class Collections2 {

	public static void main(String[] args) {
		List<Student3> students = List.of(new Student3(1, "Ranga"), new Student3(100, "Adam"), new Student3(2, "Eve"));
		List<Student3> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl.toString());
		Collections.sort(studentsAl);
		System.out.println(studentsAl.toString());

	}

}
