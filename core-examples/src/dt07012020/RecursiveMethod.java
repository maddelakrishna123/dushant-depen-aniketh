package dt07012020;

public class RecursiveMethod {
	
	
	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (n * factorial(n-1));  // recursion
		}
	}

	public static void main(String[] args) {


		 int fact = factorial(5);
		 
		 System.out.println(fact);
		
		

	}

}

/*
 * calling a method in same method
 * 
 *    51 = 5! * 4! * 3 ! * 2 ! * 1!
 *        
 */
