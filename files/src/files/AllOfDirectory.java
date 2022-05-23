package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

// �Լ��� ���α׷��� ������ ����Ͽ� ���ϵ��� ��ĵ�ϰ� ���丮�� ��ĵ�ϴ� �۾�
public class AllOfDirectory {

	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");
		Files.list(currentDirectory).forEach(System.out::println); // file ���� ������
		Files.walk(currentDirectory, 1).forEach(System.out::println);
		System.out.println();
		// walk�� ���ڴ� ������ ��� �����ΰ�

		// ���ϵ��� �ɷ��� ���ϴ� ���ϵ鸸 ���� ��
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
		System.out.println();

		// ���ϴ� ������ ã�Ƴ��� ��
		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
		Files.find(currentDirectory, 4, matcher).forEach(System.out::println);
		System.out.println();

		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, javaMatcher).forEach(System.out::println); // �����ϴ� ���丮�� ���
		System.out.println();

		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println); // �����ϴ� ���丮�� ���
		System.out.println();

		Path pathFileToRead = Paths.get("./resources./data.txt");
		List<String> lines = Files.readAllLines(pathFileToRead);
		Files.readAllLines(pathFileToRead);
		System.out.println(lines); // ���Ͽ��� ��� ���� ������ �����ͼ� ����Ʈ�� �������� ���, �ڵ尡 ������� ȿ��x -> �ѹ��� �а� �޸𸮿� ����Ǳ� ����
		System.out.println();

		Files.lines(pathFileToRead).forEach(System.out::println); // �� �� �� �� �������, ���� ���� �ٷ궧 ����
		Files.lines(pathFileToRead).map(String::toLowerCase).forEach(System.out::println); // �ҹ��ڷ� ��ȯ
		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("a"))
				.forEach(System.out::println); // a�� �����ϴ� ���ڵ�

		Path pathFileToWrite = Paths.get("./resources./file-write.txt"); // ���ϴ� ���� ���� ��� �� �̸� & ������
		List<String> list = List.of("Apple", "Boy", "Cat", "Dog", "Elephant");
		Files.write(pathFileToWrite, list);

	}

}
