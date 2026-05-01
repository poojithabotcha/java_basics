
public class givennumberispalindromeuptonnumber {
	public static void main(String[]args) {
		int n,r,rev=0;
		int limit=100;
		System.out.print("palindrome numner from 1to N");
		for(int i=1;i<=limit;i++) {
			n=i;
			while(n>0) {
				r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			if(rev==i) {
				System.out.print(i+"");
			}
			rev=0;
		}
	}

}
