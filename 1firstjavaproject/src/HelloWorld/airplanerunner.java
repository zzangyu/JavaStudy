package HelloWorld;

public class airplanerunner {
	public static void main(String[] args) {
		
		airplane captain = new airplane(3);
		airplane ca = new airplane(15);
		airplane sn = new airplane(100);
		
		System.out.println("���� "+captain.getairline()+"��");
		System.out.println("�¹��� "+ca.getairline()+"��");
		System.out.println("�մ� "+sn.getairline()+"��");
		
		captain.decreaseairline(1);
		ca.increaseairline(2);
		sn.decreaseairline(20);
		
		System.out.println("���� "+captain.getairline()+"��");
		System.out.println("�¹��� "+ca.getairline()+"��");
		System.out.println("�մ� "+sn.getairline()+"��");
		
		
	}
}
