import java.util.Scanner;
public class basicsimpleintrest {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter prinicipal amount");
		double principal=input.nextDouble();
		System.out.print("Enter a rate of intrest");
		double rate=input.nextDouble();
		System.out.print("Enter time period in years");
		double time=input.nextDouble();
		double simpleIntrest=(principal*rate*time)/100;
		System.out.println("Simple Intrest:"+simpleIntrest);
		input.close();
	}

}
