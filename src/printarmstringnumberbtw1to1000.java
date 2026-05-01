
public class printarmstringnumberbtw1to1000 {
	public static void main(String[]args) {
		int n,r,limit=1000,sum=0;
		System.out.print("Armstrong numbers from 1toN");
		for(int i=1;i<=limit;i++) {
			n=i;
			while(n>0) {
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if(sum==i) {
				System.out.print(i+"");
			}
			sum=0;
		}
	}

}
