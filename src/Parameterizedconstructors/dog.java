package Parameterizedconstructors;

public class dog {
	private String name;
	private String color;
	public dog(String name,String color) {
		this.name=name;
		this.color=color;
	}public static void main(String[]args) {
		dog mydog=new dog("Biley","black");
		System.out.println("dog name:"+mydog.name);
		System.out.println("dogs color:"+mydog.color);
	}
	

}
