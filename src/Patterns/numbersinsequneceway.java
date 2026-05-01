package Patterns;

public class numbersinsequneceway {
	public static void main(String[]args) {
		int a=3;
		int b=4;
		int n=5;
		for(int i=0;i<=n;i++) {
			int c=a+b;
			System.out.print(a+""+b+""+c);
			System.out.println();
			a=c;
			b=b+1;
		}
	}

}
