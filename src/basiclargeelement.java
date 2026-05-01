
public class basiclargeelement {
	public static void main(String[]args) {
		int[]numArray= {1,2,3,4,5,6,10,25};
		int largest=numArray[0];
		for(int num:numArray) {
			if(largest<num) {
				largest=num;
			}
		}
		System.out.println("largest element is:"+largest);
	}

}
