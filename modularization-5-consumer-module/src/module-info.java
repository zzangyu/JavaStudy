module com.consumer {
	requires com.service.provider;
	requires java.logging;
	// requires transtive java.logging; - consumer�� requires�� module�鵵 ���� logging ���
	// ����
}