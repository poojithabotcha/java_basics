package Parameterizedconstructors;

public class dog3 {
	private String color;
	public dog3(String color) {
		this.color=color;
	}
	boolean compareColor(dog3 other) {
		return this.color.equals(other.color);
	}
	public static void main(String[]args) {
		dog3 d1=new dog3("brown");
		dog3 d2=new dog3("brown");
		if(d1.compareColor(d2)) {
			System.out.println("both dogs are same color:");
		}
		else {
			System.out.println("both dogs are different color:");
		}
		
	}

}
