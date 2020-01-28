package dt07012020;

public class CallByValueandReference {
	
	public static  void swap(int a , int b) // a, b are formal parameters
	{
		
		int c =a;
		a = b;
		b = c;
		System.out.println("Swapped Values  a ="+a+", b ="+b);
	}

	
	public static void changeArray(int[] a)
	{

for (int i = 0; i < a.length; i++) {
	a[i]= a[i] +10;
	System.out.println(a[i] );
	
}
	}
	
	
	public static void main(String[] args) {
		
		int a = 10, b = 5;
		
		System.out.println("Before Swapimg a = "+a+" , b = "+b);

                    swap(a,b);  // actual parameters  call by value
       System.out.println("After Swapimg a = "+a+" , b = "+b);
       
       
		
		int inputArray[] = {2,3,4,5,6};
		System.out.println(inputArray);
		
		changeArray(inputArray);
		 System.out.println("After Changing");
     
		 for (int i = 0; i < inputArray.length; i++) {
			
			 
			 System.out.println(inputArray[i]+ " "+(inputArray[i]+5) );
			
		}
		
		
		
		
		/*
		 * Primitive
		 * int, 
		 * Secondary /
		 * 
		 *  Class 
		 *  String
		 *  Array
		 */
		
		

	}

}
