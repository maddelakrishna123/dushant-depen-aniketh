package dt20012020;

public class Book  extends Item {
	
	// id;
	// name;
	// price;
	// author;
	// no of pages
	
	private int pages;
	
	
	public Book(int id, String name, double price,int pages) {
		super(id, name, price);
		
		this.pages = pages;
		
	}
	
	
	
	
	
	
	
	
	
	









	public Book() {
		super();
	}



















	private String author;
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public  void dispalytItem()
	{
		
		System.out.println(id +" "+name+" "+price+" "+pages);
	}


	
	
	
	
}
