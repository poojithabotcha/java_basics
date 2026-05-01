package Parameterizedconstructors;

public class dog4 {
	private double weight;
	public dog4(double weight) {
		this.weight=weight;
	}
	boolean isLargeBreed() {
		return weight>35;
	}
	public static void main(String[]args) {
		dog4 d=new dog4(15);
		if(d.isLargeBreed()) {
			System.out.println("the dog is largebreed");
		}
		else {
			System.out.println("the dog is not a largebreed");
		}
	}

}
