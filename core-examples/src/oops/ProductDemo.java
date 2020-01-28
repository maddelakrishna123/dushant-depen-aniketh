package oops;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {

		// create Product Objects
		Scanner sc = new Scanner(System.in);
		
		Product p1;
		
		System.out.println("Enter Product Info");
		
		
	       
		p1 = new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble());  // call to default  constructor
		p1.getProductInfo();
		
		
	
		
	}

}
