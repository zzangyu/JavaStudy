package com.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ranga");
		names.add("Ravi");
		names.add("John");
//		List<String> copyOfnames = List.copyOf(names); 이거쓰면 불변!
		doNotChange(names);
		System.out.println(names);

	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotbeAllowed");
	}

}
