package constructoroverloading;
//book class to check if the book is a best seller.
public class book3 {
	private  String title;
	private int copiessold;
	public book3(String title,int copiessold) {
		this.title=title;
		this.copiessold=copiessold;
	}
	boolean isbestSeller() {
		return copiessold>=1000;
	}
	public static void main(String[]args) {
		book3 b1=new book3("java",12000);
		if(b1.isbestSeller()) {
			System.out.println("the book is best seller");
		}
		else {
			System.out.println("the book is not a best seller");
		}
	}

}
