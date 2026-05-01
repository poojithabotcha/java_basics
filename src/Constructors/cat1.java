package Constructors;

public class cat1 {
	private String name;
	private String breed;
	private int age;
	public cat1() {
		this.name="jully";
		this.breed="soft";
		this.age=1;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[]args) {
		cat1 mycat1=new cat1();
		System.out.println("cat name:"+mycat1.getName());
		System.out.println("cat breed:"+mycat1.getBreed());
		System.out.println("cat age:"+mycat1.getAge());
	}

}
