package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

// 함수형 프로그래밍 컨셉을 사용하여 파일들을 스캔하고 디렉토리를 스캔하는 작업
public class AllOfDirectory {

	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");
		Files.list(currentDirectory).forEach(System.out::println); // file 안의 폴더들
		Files.walk(currentDirectory, 1).forEach(System.out::println);
		System.out.println();
		// walk의 숫자는 파일을 몇번 들어갈것인가

		// 파일들을 걸러서 원하는 파일들만 고르는 법
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
		System.out.println();

		// 원하는 파일을 찾아내는 법
		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
		Files.find(currentDirectory, 4, matcher).forEach(System.out::println);
		System.out.println();

		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, javaMatcher).forEach(System.out::println); // 현존하는 디렉토리만 출력
		System.out.println();

		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println); // 현존하는 디렉토리만 출력
		System.out.println();

		Path pathFileToRead = Paths.get("./resources./data.txt");
		List<String> lines = Files.readAllLines(pathFileToRead);
		Files.readAllLines(pathFileToRead);
		System.out.println(lines); // 파일에서 모든 줄의 내용을 가져와서 리스트에 형식으로 출력, 코드가 길어지면 효율x -> 한번만 읽고 메모리에 저장되기 떄문
		System.out.println();

		Files.lines(pathFileToRead).forEach(System.out::println); // 한 줄 한 줄 출력해줌, 많은 양을 다룰때 좋음
		Files.lines(pathFileToRead).map(String::toLowerCase).forEach(System.out::println); // 소문자로 변환
		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("a"))
				.forEach(System.out::println); // a를 포함하는 문자들

		Path pathFileToWrite = Paths.get("./resources./file-write.txt"); // 원하는 파일 생성 경로 및 이름 & 내용담기
		List<String> list = List.of("Apple", "Boy", "Cat", "Dog", "Elephant");
		Files.write(pathFileToWrite, list);

	}

}
