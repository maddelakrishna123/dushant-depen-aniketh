package oops;



public class Product {
	private int id;
	private String name;
    private double price;
    private	double discount;
	
	/*
	 * Constructor is special method used to intialize instance variables
	 * 1) Name of The Constructor is always name of the class
	 * 2) constructor can have access modifiers
	 * 3) should not return any value including void
	 * 
	 */

// class , objects, constructor, encapsulation
	
	  public  Product(int id, String name, double price, double discount)
	   {
		   this.id = id;
		   this.name= name;
		   this.price=price;
		   this.discount = discount;
		   
		   
		   System.out.println("Inside the constructor");
	   }
	
	public double getPrice()
	{
		return price-discount;
	}
	
	
	
	public void getProductInfo()
	{
		System.out.println(id +" "+name+" "+price +" "+discount);
	}

	
	
	public int add(int x , int y)
	{
		int a =x;
		int b =y;
		int c = a+b;
		return c;
	}
	
	
	
	// 4 varible , one constr, two methods
}
