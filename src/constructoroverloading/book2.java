package constructoroverloading;
//compare two books
public class book2 {
	private String title;
	private double price;
	public book2(String title,double price) {
		this.title=title;
		this.price=price;
	}
	void comparePrice(book2 otherbook) {
		if(this.price>otherbook.price) {
			System.out.println(this.title+"is costlier");
			
		}
		else if(this.price<otherbook.price) {
			System.out.println(this.title+"is lesscost");
		}
		else {
			System.out.println(this.title+"is same cost");
		}
	}
	public static void main(String[]args) {
		book2 b1=new book2("javabook",500);
		book2 b2=new book2("sqlbook",400);
		b1.comparePrice(b2);
	}

}
