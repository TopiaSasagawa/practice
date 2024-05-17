public class Book extends TangibleAsset{
	private String isbn;
	public Book (String name, int prace, String color, String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}

	public String getIsbm(){ return this.isbn ;}
}
