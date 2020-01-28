package dt16012020;

public class Book {
	
	
	private int id;
	private String title;
	private String author;
	private double price;
	
	
	// constructors
	
	
	
	// gettes and setters
	
	
	
	public void bookInfo()
	{
		System.out.println(id +" "+title +" "+author+" "+price);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

}

// encpasulation - binding or wraping data and operations into single unit is called ecpasulation

// security to data (hiding data )