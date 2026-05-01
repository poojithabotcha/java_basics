package constructoroverloading;

public class book4 {
	private String title;
	private int totalReview;
	private int totalRating;
    public book4(String title,int totalReview,int totalRating) {
    	this.title=title;
    	this.totalReview=totalReview;
    	this.totalRating=totalRating;
    }
    double caluculateRating() {
    	return(double)totalRating/totalReview;
    }
    public static void ain(String[]args) {
    	book4 b1=new book4("sql",200,300);
    	System.out.println("book rating:"+b1.caluculateRating());
    }
}
