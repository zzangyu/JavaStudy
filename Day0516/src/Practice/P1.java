package Practice;

public class P1 {

	public static void main(String[] args) {

		String[] src = { "A", "B", "C", "D", "E" };
		String[] dest = new String[10];
		System.arraycopy(src, 0, dest, 0, src.length);
		System.arraycopy(src, 0, dest, 5, src.length);
		for (String string : dest) {
			System.out.print(string + "\t");
		}

	}

}
