package Inheritance;

public class EmployeeRunner {
//employeeGrade, title, employer, employeeGrade, salary,getName(), getPhoneNumber(), getEmail(), getCollegeName(), getClassName()
	public static void main(String[] args) {
		Employee employee = new Employee("������", "������");
		employee.setEmail("hanchangyu@naver.com");
		employee.setEmployeeGrade("�븮");
		employee.setEmployer("������");
		employee.setPhoneNumber("01041405191");
		System.out.println(employee);
	}

}
