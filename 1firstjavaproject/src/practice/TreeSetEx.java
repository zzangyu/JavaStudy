package practice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet(Set.of(5, 99, 69, 87, 55, 33));
		System.out.println(treeSet.ceiling(33));
		System.out.println(treeSet.floor(33));
		System.out.println(treeSet.floor(34));
		System.out.println(treeSet.headSet(55));
		System.out.println(treeSet.tailSet(55));
		System.out.println(treeSet.subSet(33, 55));
		System.out.println(treeSet.subSet(33, true, 55, true));
		System.out.println(treeSet.subSet(33, false, 55, false));
		System.out.println(treeSet);

	}
}
