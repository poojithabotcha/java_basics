import java.util.Scanner;
public class countofvowels {
	public static void main(String[]args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name");
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("number of vowels in a name:"+(str)+"\n");
	}

}
