package com.vectorex;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx01 {
	private static final String colors[] = { "Black", "Yellow", "Green", "Blue", "Red", "Yellowish Green" };

	public static void main(String[] args) {

		int i;
		String str;
		Vector<String> v = new Vector<>();
		for (i = 0; i < colors.length; i++) {
			v.add(colors[i]);
		}
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			str = it.next();
			System.out.print(str + "  ");
		}
		System.out.println();
		System.out.println(v);
	}

}
