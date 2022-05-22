package Array_ArrayList;

public class ABCrunner {

	public static void main(String[] args) {
		
		int[] mm = {1, 2, 3, 4};
		ABC abc = new ABC("aa", mm);
		
		System.out.println(abc);
		
		abc.addNewMm(35);
		System.out.println(abc);
		abc.removeMmAtIndex(0, 0);
		System.out.println(abc);
		
	}

}
