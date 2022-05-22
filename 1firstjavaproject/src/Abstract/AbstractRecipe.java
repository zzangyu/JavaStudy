package Abstract;

public abstract class AbstractRecipe {
		// prepare �غ���� 
		// receipe ������
		// cleanup û��
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
	

}
