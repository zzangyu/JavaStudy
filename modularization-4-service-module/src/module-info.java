/*
 * 모듈과 일반 자바 프로젝트의 차이 - 모듈에는 module-info.java라는 파일이 있다는 점 - 일반 자바 파일에는 -(하이픈)을 쓸
 * 수 없다. 모듈 제외 ! 모듈화의 장점 1. Compile Time Checks 2. Better Encapsulation - 노출하고
 * 싶은 패키지만 노출 가능 3. Smaller Java Runtime - 자바의 특정 모듈만 사용하고 싶다라고 해서 시간이 줄어듦
 */

module com.service.provider {
	exports com.sorting.util;
	exports com.sorting.algorithm;

}