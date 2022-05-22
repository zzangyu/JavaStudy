package Inheritance;

public class EmployeeRunner {
//employeeGrade, title, employer, employeeGrade, salary,getName(), getPhoneNumber(), getEmail(), getCollegeName(), getClassName()
	public static void main(String[] args) {
		Employee employee = new Employee("한찬규", "웹개발");
		employee.setEmail("hanchangyu@naver.com");
		employee.setEmployeeGrade("대리");
		employee.setEmployer("한찬규");
		employee.setPhoneNumber("01041405191");
		System.out.println(employee);
	}

}
