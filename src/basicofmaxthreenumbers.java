
public class basicofmaxthreenumbers {
	public static void main(String[]args) {
		int a=25;
		int b=35;
		int c=45;
		int max=Math.max(a, Math.max( b, c) );
		System.out.println("Maximum of three numbers:"+max);
	}

}
