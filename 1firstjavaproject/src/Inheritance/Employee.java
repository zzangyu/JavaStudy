package Inheritance;

import java.math.BigDecimal;

public class Employee  extends Person{
	// title, employer, employeeGrade, salary
	private String title;
	private String employer;
	private String employeeGrade;
	private BigDecimal salary;
	
	public Employee(String name, String title) {
		super(name);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
//	public String toString() {
//		return String.format("employeeGrade[%s]\ngetName[%s]\ngetPhoneNumber[%s]\ngetEmail[%s]\ngetCollegeName[%s]\ngetClassName[%s]", employeeGrade, 
//						getName(), getPhoneNumber(), getEmail(), getCollegeName(), getClassName());
//	}
	public String toString() {
		return super.toString() + "  "+ title + "\n"+ employeeGrade + "  "+ employer + "  "+ salary;
	}
	
}
