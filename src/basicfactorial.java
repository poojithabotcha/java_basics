
public class basicfactorial {
	public static void main(String[]args) {
		int n=6;
		int i=1;
		long factorial=1;
		while(i<=n) {
			factorial*=i;
			i++;
		}
		System.out.println("factorial is:"+factorial);
	}

}
