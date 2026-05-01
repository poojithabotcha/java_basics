package Arrays;

public class addtwomatrix {
	public static void main(String[]args) {
		int[][]arr1= {{1,2,3},{3,4,5}};
		int[][]arr2= {{2,3,4},{3,4,6}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr1[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
