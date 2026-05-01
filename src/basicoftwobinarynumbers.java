import java.util.Scanner;
public class basicoftwobinarynumbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first binary number");
		String b1=sc.nextLine();
		System.out.println("Enter second binary number");
		String b2=sc.nextLine();
		int n1=Integer.parseInt(b1,2);
		int n2=Integer.parseInt(b2,2);
		int sum=n1+n2;
		System.out.println("sum of two binary numbers:"+Integer.toBinaryString(sum));
	}

}
