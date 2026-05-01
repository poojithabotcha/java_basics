package constructoroverloading;
//allowing the discount price
public class book1 {
	String title;
    double price;
	public book1(String title,double price) {
		this.title=title;
		this.price=price;
	}
    void applyDiscount(double discountpercentage) {
		price=price-(price*discountpercentage/100);
	}
	 void display() {
		System.out.println("Title:"+title);
		System.out.println("price after the dicuntpercentage:"+price);
	}
	public static void main(String[]args) {
		book1 b1=new book1("java basics",500);
		b1.applyDiscount(20);
		b1.display();
		
	}

}
