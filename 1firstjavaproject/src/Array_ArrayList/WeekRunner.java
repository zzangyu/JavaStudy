package Array_ArrayList;

public class WeekRunner {

	public static void main(String[] args) {
		String[] fuck = {"Sunday", "Monday", "Teusday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		String longest = "";
		for(String fuckyou:fuck) {
			if(longest.length() < fuckyou.length()) {
				longest = fuckyou;
			}
		}
		System.out.println(longest);
		
		for(int i = fuck.length-1; i >= 0 ; i--) {
			System.out.print(fuck[i]+" ");			
		}

	}

}
