package dt20012020;

public class Demo {

	public static void main(String[] args) {
	
	  // Item  Parent / Super / Base Class
		
		// Book  Child/ sub / derived
		
		// class Book extends Item 
	
		
		//Book b = new Book(); // sub class Object
		
		//Item i = new Item(); // suber class
		
	double x = 7;
		
	Item item = new Book(); 
	item.dispalytItem();
	
	
	int x1 =(int) 4.3;
	
	//Book book =(Book) new Item();
	//book.dispalytItem();
	
	
// Types of  Inheritance
	
	/*
	 *  1 .Simpele Inheritance
	 *      one level
	 *      sub - sup
	 *  2. Mutli level Inheritance
	 *  
	 *        B(Sub) extends  A(Super) 1
	 *        
	 *        C(Sub) extends B(Super)      2
	 *        
	 *        C ->B ->A
	 *        
	 *  3.Mutilple Inheritace (Java does not support)
	 *  
	 *       C extends A, B
	 *       
	 *       class A
	 *       {
	 *       m()
	 *       {
	 *       // a imp
	 *       }
	 *       }
	 *       
	 *       class B 
	 *       {
	 *       
	 *       m()
	 *       {
	 *       // b impl
	 *       }
	 *       }
	 *       
	 *       
	 *       
	 *       
	 *      class C extends A, B
	 *      {
	 *      }
	 *       
	 *       
	 *       C obj = new C();
	 *        obj.m(); // ambiguty
	 */
		
		 
	
	// Item  // Book // StoryBook
	
	Item i = new Book();
	
	  i = new StoryBook();
	  
	  i.dispalytItem();
		 
		 

		
	}

}
