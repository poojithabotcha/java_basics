package Parameterizedconstructors;

public class dog1 {
	private int barkcount=0;
	void bark() {
		barkcount++;
		System.out.println("dog is barking");
	}
	int getBarkCount() {
		return barkcount;
	}
	public static void main(String[]args) {
		dog1 d=new dog1();
		d.bark();
		d.bark();
		System.out.println("barked:"+d.getBarkCount());
	}

}
