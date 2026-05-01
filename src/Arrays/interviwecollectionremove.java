package Arrays;

public class interviwecollectionremove {
	public static void main(String[]arg) {
		int[]arr= {1,2,3,4,1,2,3,5,4,6,5,7,7,8};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					for(int k=j;k<n-1;k++) {
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}
			}
		}
		System.out.println("remove duplicates:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
