package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CharacterSetEx {

	public static void main(String[] args) {
		List<Character> characters = List.of('a', 'c', 'm', 'z', 'a', 'b', 'z', 'z', 'f');
		List<Character> charactersAl = new ArrayList(characters);
		System.out.println(charactersAl);
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet);
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println(linkedHashSet);
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println(hashSet);
	}

}
