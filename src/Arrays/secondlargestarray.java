package Arrays;

public class secondlargestarray {
	public static void main(String[]args) {
		int[]arr= {10,20,30,40,50};
		int large=arr[0];
		int second=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large) {
				second=large;
				large=arr[i];
			}
			else if(arr[i]>second&&arr[i]!=large) {
				second=arr[i];
			}
		}
		System.out.println("second largest:"+second);
	}

}
