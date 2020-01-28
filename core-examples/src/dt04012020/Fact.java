package dt04012020;

public class Fact {
	// Method Definition
	
 public static int factorial(int n)  // method prototype or signature
	{
		// body
		
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact = fact *i;
		}
		return fact;
	}

	// instance method must be called through instance of the class(Object)
 public int div(int a, int b)
 {
	 int c = a/b;
	 return c;
	 

 }
 
 public static boolean isEven(int n)
 {
	 if(n % 2 == 0)
		 return true;
	 else
		 return false;
 }
 
 public String greetMe()
 {
	return "Welcome To Java Programing"; 
 }
 
 
 public static Fact getFact()
 {
	 Fact f = new Fact();
	 return f;
 }
 
 
 public void addTwoNumber(int a, int b)
 {
	 int c = a + b;
	 
	 System.out.println(c);
	// return c;
	 
 }
 
 // to take an array as input and print all the even numbers
 
 
 public static void allEvens(int[] a)
 {
	 for (int i = 0; i < a.length; i++) {
		 
		 if(a[i] % 2 == 0)
		 {
			 System.out.println(a[i]);
		 }
		
	}
}

 
 
 public static int[] getIntGrades()
 {
	 int[] intGrades = {1,2,3,4};
	 return intGrades;
 }
 
 
 
 public static void main(String[] args) {
	
	 factorial(5);
	 
	 Fact f = new Fact();
	int res = f.div(12, 5); // method call
	
	String message = f.greetMe();
	boolean s= isEven(10);
	
	System.out.println(res);
	
int[] a =	getIntGrades();
for (int i = 0; i < a.length; i++) {
	
	System.out.println(a[i]);
	

	
}

f.addTwoNumber(3, 7);
}
	
	
}


/*

 a) public is access modifier - Optional
 
 Access Modifiers
 public  - any where
 private  - in the same class 
 protected- sub class
 package Modifier ( No Modifer)
 static is non access Modifier 
 
 b) Non Access Modifier - optional
 
 static, final, synchronized abstract
 
 
 c) return type - specifies the type of result the method should return - mandatory
 
 any 
 
 1) primitive
 2) String
 3) Any Other derived types (User defined Class types)
 4) any array of p or string or userdefined objects
 
 5) void - null data types it returns nothing
 
 d) Name of the Method   - madatory
 
    is any valid identifier
    
    
    
    e) Arguments - input parameters
    
    
    f) body  - logical sequence of instructions


     
*/