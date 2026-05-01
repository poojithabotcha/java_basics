package Arrays;
import java.util.Scanner;
public class linearsearch {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//input array size
		System.out.print("enter number of elements");
		int n=sc.nextInt();
		int[]arr=new int[n];
		//input array element
		System.out.print("eneter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//element to search
		System.out.print("enter element to search");
		int key=sc.nextInt();
		//linear search logic
		int position=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				position=i;
				break;
			}
		}
		//output result n ]
		if(position!=-1) {
			System.out.println("element found at index:"+position);
		}else {
			System.out.println("element no found");
		}
		sc.close();
	
	}

}
