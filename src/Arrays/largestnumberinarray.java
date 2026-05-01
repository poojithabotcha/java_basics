package Arrays;

public class largestnumberinarray {
	public static void main(String[]args) {
		int arr[]= {20,30,40,50,60,100};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("largest element is:"+max);
	}

}
