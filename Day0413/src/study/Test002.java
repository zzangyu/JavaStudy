// class AAA 배열을 끌고 오는거임 (배열 나중에 배움, AAA 제대로 쓴거 아님)

package study;

public class Test002 {

	class Student {
	 	String name;
	 	int haknum;
	 
	}
	
public static void main(String[] args) {
	AAA a = new AAA();	//AAA 클래스에서 끌고온다.
	Student st[];
	 System.out.println(a.haknum);
	}

}
