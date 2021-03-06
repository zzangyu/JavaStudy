package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student4 implements Comparable<Student4> {
	private int id;
	private String name;

	public Student4(int id, String name) {
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
		return id + "  " + name;
	}

	@Override
	public int compareTo(Student4 that) {
		return Integer.compare(this.id, that.id);

	}
}

class DescendingComparator implements Comparator<Student4> {

	@Override
	public int compare(Student4 student1, Student4 student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

class AscendingComparator implements Comparator<Student4> {

	@Override
	public int compare(Student4 student1, Student4 student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class Collections3 {

	public static void main(String[] args) {
		List<Student4> students = List.of(new Student4(1, "haha"), new Student4(5, "koko"), new Student4(0, "sinchan"));
		List<Student4> studentsAl = new ArrayList(students);
		System.out.println(students.toString());

		Collections.sort(studentsAl);
		System.out.println(studentsAl.toString());

		Collections.sort(studentsAl, new AscendingComparator());
		System.out.println(studentsAl.toString());

		Collections.sort(studentsAl, new DescendingComparator());
		System.out.println(studentsAl.toString());
	}

}
