package Arrays;

public class linearsearch1 {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5,6,7};
		int key=7;
		int position=-1;
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i]==key) {
				position=i;
				break;
			}
		}
		if(position!=-1) {
			System.out.println("found at index:"+position);
		}
		else {
			System.out.println("not found");
		}
	}

}
