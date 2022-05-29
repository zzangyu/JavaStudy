/*
 * 모듈과 일반 자바 프로젝트의 차이 - 모듈에는 module-info.java라는 파일이 있다는 점 - 일반 자바 파일에는 -(하이픈)을 쓸
 * 수 없다. 모듈 제외 !
 */

module com.service.provider {
	exports com.sorting.util;
	exports com.sorting.algorithm;

}