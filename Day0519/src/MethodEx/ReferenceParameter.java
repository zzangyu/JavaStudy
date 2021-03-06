package MethodEx;

public class ReferenceParameter {

	public void increase(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i]++;
		}
	}

	public static void main(String[] args) {
		ReferenceParameter rp = new ReferenceParameter();
		int[] ref = { 100, 600, 1000 };

		rp.increase(ref);

		for (int a = 0; a < ref.length; a++) {
			System.out.println("ref[" + a + "]: " + ref[a]);
		}
	}

}
