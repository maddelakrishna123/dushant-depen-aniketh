package dt20012020;

public class Item {
	
	
	protected int  id;
	protected String name;
	protected double price;
	
	
   protected static final int X = 10;
	
	
	
	
	
	
	
  // this
   // super
   
   // final 
   
   // poly
   // encapsulation
   // class
   // Object
   // overlaoding  & overriding 
   
   // binding
   
   // intertance - extends
   
   
    // types of inheritances 
   
   // 







	
	// Object class is the super class






	public Item(int id, String name, double price) {
		super();  // Object Class
		this.id = id;
		this.name = name;
		this.price = price;
	}








	public Item() {
		super();
	}








	public int getId() {
		return id;
	}








	public void setId(int id) {
		this.id = id;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}








	public double getPrice() {
		return price;
	}








	public void setPrice(double price) {
		this.price = price;
	}








	public  void dispalytItem()
	{
		
		System.out.println(id +" "+name+" "+price);
	}
	

}


/*
 *  Inheritance - 

*/
