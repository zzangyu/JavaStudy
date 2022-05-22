package HelloWorld;

public class airplane {

	// ºñÇà±â °´Ã¼. ½Â¹«¿ø, Å¾½Â°´, ºñÇà±â ¼ö
	private int airline;
	
	airplane(){
		this(0);
	}
	
	airplane(int airline){
		this.airline = airline;
	}


	public int getairline() {
		return airline;
	}

	public void setairline(int airline) {
		if(airline>0)
		this.airline = airline;
	}
	
	public void increaseairline(int nani) {
		setairline(this.airline + nani);
	}
	
	public void decreaseairline(int nani) {
		setairline(this.airline - nani);
	}
	
	
}
