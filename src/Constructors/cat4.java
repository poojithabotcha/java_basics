package Constructors;

public class cat4 {
	int age;
	public cat4(int age) {
		this.age=age;
	}
	void compareAge(cat4 c) {
		if(this.age>c.age) {
			System.out.println("first cat is older");
		}
		else if(this.age<c.age) {
			System.out.println("second cat is younger");
		}
		else {
			System.out.println("both the cat are same age");
		}
	}
	public static void main(String[]args) {
		cat4 c1=new cat4(1);
		cat4 c2=new cat4(2);
		c1.compareAge(c2);
	}

}
