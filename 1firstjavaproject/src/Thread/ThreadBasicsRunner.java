package Thread;
/*
방법! - 병렬 처리를 위해 이걸 씁니다 !!
extends Thread - Thread라고 불리는 클래스를 확장한다.
implements Runnable - Runnable이라고 불리는 인터페이스를 실행한다.
NEW
- 실행 준비는 끝났지만 실행하라는 명령이 없어서 실행x
- Task1 task1 = new Task1(); << 이 상태
- start() 메소드 사용 전
TERMINATED/DEAD
- thread가 실행~종료 된 뒤 / thread의 실행 완료 상태
- start() 메소드 사용 후
RUNNABLE
- 실행하라는 명령을 받고 출력을 하기 전 준비 상태
- 일 혹은 작업을 처리하고 싶지만 다른 thread가 우선적으로 실행되고 있는 상태
- start() 메소드 사용 후
RUNNING
- RUNNABLE 뒤의 실행중인 상태
- start() 메소드 사용 후
BLOCKED/WAITING
- 데이터베이스를 기다리고 있는데 데이터베이스가 느리다면 사용자는 차단되게 된다.
- 실행이 완료되지 않은 다른 thread로부터 데이터를 입력받아야 하는 상황
- start() 메소드 사용 후

synchronized(동기화)
- 동기화된 thread가 실행중이라면 다른 thread들은 모두 대기를 해야한다.
- 안정적이지만 overhead가 발생할 수도 있다.

Thread.sleep()
- 설정한 시간 동안 멈추게 할 수 있다.
- 1000(=1초)

Thread.yield()
- CPU 사용 중단을 권유한다.(필수x 그저 추천하는거임.)
 */

public class ThreadBasicsRunner {

	public static void main(String[] args) {
		// Task 1
		for (int i = 0; i < 9; i++) {
			System.out.print(i);
		}
		// Task 1이 끝날 때까지 Task 2는 대기하는 상황이 이어진다.
		// Threads는 이렇게 유사성을 가진 모든 수행문을 동시에 실행하도록 해준다.
		System.out.println("\nTask 1 Done");
		// Task 2
		for (int i = 9; i < 19; i++) {
			System.out.print(i);
		}
		System.out.println("\nTask 2 Done");
		// Task 3
		for (int i = 19; i < 29; i++) {
			System.out.print(i);
		}
		System.out.println("\nTask 3 Done");
		System.out.println("Main Done");
	}

}
