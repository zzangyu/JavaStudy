package HelloWorld;

public class airplanerunner {
	public static void main(String[] args) {
		
		airplane captain = new airplane(3);
		airplane ca = new airplane(15);
		airplane sn = new airplane(100);
		
		System.out.println("±âÀå "+captain.getairline()+"¸í");
		System.out.println("½Â¹«¿ø "+ca.getairline()+"¸í");
		System.out.println("¼Õ´Ô "+sn.getairline()+"¸í");
		
		captain.decreaseairline(1);
		ca.increaseairline(2);
		sn.decreaseairline(20);
		
		System.out.println("±âÀå "+captain.getairline()+"¸í");
		System.out.println("½Â¹«¿ø "+ca.getairline()+"¸í");
		System.out.println("¼Õ´Ô "+sn.getairline()+"¸í");
		
		
	}
}
