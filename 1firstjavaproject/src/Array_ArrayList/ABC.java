package Array_ArrayList;

import java.util.ArrayList;

public class ABC {

	private String string;
	private ArrayList<Integer> mm = new ArrayList<Integer>(); 
	// ArrayList<Integer> ���� =  new ArrayList<Integer>(); �̰� �־���� 
	// public String toString() {  ������� ��� ������.
	//		return string+mm;
	//	}


	public ABC(String string, int...mm) {
		this.string = string;
		for(int mm2:mm) { // mm�� ���ڵ��� mm2�� ����. �� mm2�� this.mm�� ����!
			this.mm.add(mm2);
		}
	}
	
	public void addNewMm(int i) {
		mm.add(i);
	}
	public void removeMmAtIndex(int index, int index2) {
		mm.remove(index); // Ư�� ��ġ�� ����°��̴�.
		mm.remove(index2); // index�� �������� �ٽ� 0���� ���� �������°Ŷ� ó�� ��ġ�� �޶�����
	}
	
	public String toString() {
		return string+mm;
	}
	
	
}
