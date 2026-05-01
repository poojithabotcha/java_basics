import java.util.Scanner;
public class basictwocomplexnumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real part of first complex number");
		int a=sc.nextInt();
		System.out.print("Enter imaginary part of first complex number");
		int b=sc.nextInt();
		System.out.print("Enter real part of second complex number");
		int c=sc.nextInt();
		System.out.print("Enter imaginary part of second complex number");
		int d=sc.nextInt();
		int real=a+c;
		int imaginary=b+d;
		System.out.println("sum of two complex numbers:"+real+"+"+imaginary+"i");
	}

}
