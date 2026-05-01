
public class basicreversse {
	public static void main(String[]args) {
		int n=123456;
		int reverse=0;
		while(n!=0) {
			int digit=n%10;
			n=n/10;
			reverse=reverse*10+digit;
		}
		System.out.println("reverse number:"+reverse);
	}

}
