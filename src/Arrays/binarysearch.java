package Arrays;

public class binarysearch {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5,6,7,8};
		int key=8;
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==key) {
				System.out.println("found a index"+mid);
				return;
			}
			else if(a[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("not found");
	}

}
