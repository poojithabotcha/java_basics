import java.util.Scanner;
public class basicfindquotientandremainder {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter dividend:");
		int dividend=sc.nextInt();
		System.out.print("Enter divisior");
		int divisor=sc.nextInt();
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		System.out.println("QUOTIENT="+quotient);
		System.out.println("Reaminder="+remainder);
		sc.close();
	}

}
