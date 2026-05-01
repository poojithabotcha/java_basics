package Arrays;
import java.util.*;
public class removeduplicateelement {
	public static void main(String[]args) {
		int[]arr= {10,20,30,40,50,60,20};
		Set<Integer>set=new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println("Array after removing duplicates:");
		for(int num:set) {
			System.out.print(num+"");
		}
	}

}
