module com.consumer {
	requires com.service.provider;
	requires java.logging;
	// requires transtive java.logging; - consumer에 requires한 module들도 같이 logging 사용
	// 가능
}