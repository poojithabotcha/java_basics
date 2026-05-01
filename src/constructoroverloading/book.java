package constructoroverloading;

public class book {
	private String title;
	private String autor;
	private double price;
	public book() {
		this.title="unknown";
		this.autor="unknown";
		this.price=22.33;
	}
	public book(String title,String author) {
		this.title=title;
		this.autor=autor;
		this.price=22.33;
	}
	public  book(String title,String autor,double price) {
		this.title=title;
		this.autor=autor;
		this.price=33.55;
	}
	public static void main(String[]args) {
		book b1=new book();
		System.out.println("book of title:"+b1.title);
		System.out.println("book of author:"+b1.autor);
		System.out.println("book of price:"+b1.price);
		book b2=new book("shakesspear","williams");
		System.out.println("book of title:"+b2.title);
		System.out.println("book of author:"+b2.autor);
		System.out.println("book of price:"+b2.price);
		book b3=new book("arjun sara","arjun",33.55);
		System.out.println("book of title:"+b3.title);
		System.out.println("book of author:"+b3.autor);
		System.out.println("book of price:"+b3.price);
	}

}
