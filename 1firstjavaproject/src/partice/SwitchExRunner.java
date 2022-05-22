package partice;
import java.util.Scanner;
public class SwitchExRunner {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("0 - Jan, 1 - Fab, 2 - Mar, 3 - Apr, 4 - May, 5 - Jun, 6 - Jul, 7 - Aug, 8 - Sep, 9 - Oct, 10 - Nov, 11 - Dec");
		System.out.print("choice Number - ");
		a = sc.nextInt();
		System.out.println(determinemonth(a));
	}
	public static String determinemonth(int month) {
		switch (month) {
		case 0: return "January";
		case 1: return "Fabruary";
		case 2: return "March";
		case 3: return "April";
		case 4: return "May";
		case 5: return "June";
		case 6: return "July";
		case 7: return "August";
		case 8: return "September";
		case 9: return "October";
		case 10: return "November";
		case 11: return "December";		
		}
		return "Invalid";
	}
	

}
