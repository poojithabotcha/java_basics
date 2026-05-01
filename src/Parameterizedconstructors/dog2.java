package Parameterizedconstructors;

public class dog2 {
	private boolean trained;
	public dog2(boolean trained) {
		this.trained=trained;
	}
	boolean isTrained() {
		return trained;
	}
	public static void main(String[]args) {
		dog2 d=new dog2(true);
		System.out.println("is dog trained:"+d.isTrained());
	}

}
