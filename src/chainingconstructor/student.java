package chainingconstructor;

public class student {
	private int studentid;
	private String studentname;
	private String grade;
	public student() {
		this.studentid=0;
		this.studentname="unknown";
		this.grade="unkonwn";
	}
	public student(int studentid,String studentname,String grade) {
		this.studentid=studentid;
		this.studentname=studentname;
		this.grade=grade;
	}
	public static void main(String[]args) {
		student s1=new student();
		System.out.println("studentid is:"+s1.studentid);
		System.out.println("studentname is:"+s1.studentname);
		System.out.println("grade is:"+s1.grade);
		student s2=new student(3,"pooji","fourth");
		System.out.println("studentid is:"+s2.studentid);
		System.out.println("studentname is:"+s2.studentname);
		System.out.println("grade is:"+s2.grade);
	}

}
