package Constructors;

public class cat3 {
	private double weight;
	public cat3() {
		this.weight=123.21;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public static void main(String[]args) {
		cat3 c1=new cat3();
		System.out.println("cat weight is:"+c1.getWeight());
	}

}
