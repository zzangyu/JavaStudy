package Array_ArrayList;

import java.util.ArrayList;

public class ABC {

	private String string;
	private ArrayList<Integer> mm = new ArrayList<Integer>(); 
	// ArrayList<Integer> 변수 =  new ArrayList<Integer>(); 이게 있어야지 
	// public String toString() {  요놈으로 출력 가능함.
	//		return string+mm;
	//	}


	public ABC(String string, int...mm) {
		this.string = string;
		for(int mm2:mm) { // mm의 숫자들이 mm2에 들어가고. 그 mm2가 this.mm에 들어간다!
			this.mm.add(mm2);
		}
	}
	
	public void addNewMm(int i) {
		mm.add(i);
	}
	public void removeMmAtIndex(int index, int index2) {
		mm.remove(index); // 특정 위치를 지우는것이다.
		mm.remove(index2); // index가 지워지고 다시 0부터 세서 지워지는거라 처음 위치랑 달라진다
	}
	
	public String toString() {
		return string+mm;
	}
	
	
}
