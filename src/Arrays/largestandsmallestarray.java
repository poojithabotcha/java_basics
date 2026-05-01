package Arrays;

public class largestandsmallestarray {
	public static void main(String[]args) {
		int[]arr= {20,10,30,50,60,80};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]>min) {
				arr[i]=min;
			}
		}
		System.out.println("largest element:"+max);
		System.out.println("Smallest element:"+min);
	}

}
