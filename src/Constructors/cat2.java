package Constructors;

public class cat2 {
	private int age;
	cat2(int age){
		this.age=age;
	}
	boolean iskitten() {
		return age<1;
	}
	public static void main(String[]args) {
		cat2 c1=new cat2(0);
		cat2 c2=new cat2(3);
		System.out.println("cat 1 is kitten:"+c1.iskitten());
		System.out.println("cat 2 is notkitten:"+c2.iskitten());
	}

}
