package Abstract;

public abstract class AbstractRecipe {
		// prepare 준비과정 
		// receipe 레시피
		// cleanup 청소
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
	

}
