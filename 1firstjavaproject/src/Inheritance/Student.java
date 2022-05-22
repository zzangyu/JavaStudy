package Inheritance;

public class Student extends Person{
	private String collegeName;
	private String className;
	
	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String toString() {
		return super.toString() + "  "+className +"  "+ collegeName;
	}
	
	
		
}
