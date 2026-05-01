package Constructors;

public class cat {
	private String name;
	private int age;
	public cat() {
		this.name="jully";
		this.age=0;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[]args) {
		cat mycat=new cat();
		System.out.println("cat name:"+mycat.getName());
		System.out.println("cat age:"+mycat.getAge());
	}
	
}
