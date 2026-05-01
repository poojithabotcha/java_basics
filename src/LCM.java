import java.util.Scanner;
public class LCM {
	public static void main(String[]args) {
		System.out.print("Enter a first number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("enter a second number:");
		int n1=sc.nextInt();
		int lcm;
		int max=(n>n1)?n:n1;
		while(true) {
			if(max%n==0&&max%n1==0) {
				lcm=max;
				break;
			}
			max++;
		}
		System.out.println("lcm="+lcm);
		sc.close();
	}

}
