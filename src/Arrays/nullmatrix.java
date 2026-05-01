package Arrays;

public class nullmatrix {
	public static void main(String[]args) {
		int[][]matrix= {{0,0},{0,0}};
		int n=matrix.length;
		boolean isNull=true;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]!=0) {
					isNull=false;
					break;
				}
			}
		}
		System.out.println(isNull?"Null Matrix":"not a null matrix");
	}

}
