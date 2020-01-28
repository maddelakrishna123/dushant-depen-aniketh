package dt16012020;

public class BookDemo {
	
	public static void main(String[] args) {
		Book b = new Book();
		
		//b.bookInfo();
		
		
		b.setTitle("Java Full Stack");
		b.setId(100);
		
		//b.bookInfo();
		
		
		System.out.println(b.getId());
		
		// book  is an instance  id, title, author price
	}

}
