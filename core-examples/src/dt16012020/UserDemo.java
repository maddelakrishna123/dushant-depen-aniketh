package dt16012020;

public class UserDemo {
	
	static String name="krishna" ; // instance variable
	
	static 
	{
		
  System.out.println("In static block3");
		
	}

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		System.out.println("In Main method");
		
		
		
		
		
		User u = new User();
		
		/*
		 * int x = 10; // Local Varaible;
		 * 
		 * UserDemo.sum();
		 * 
		 * System.out.println(name);
		 * 
		 * UserDemo ud = new UserDemo(); ud.displayName();
		 * 
		 */
		/*
		 * // Create Users
		 * 
		 * User user1 = new User(12, "krishna kumar", "7899", "a@gmail.com"); // default
		 * Constructor user1.printUserInfo(); // current
		 * 
		 * 
		 * User user2 = new User(); user2.printUserInfo();
		 * 
		 * User user3 = new User(12,"krishna","7899");
		 * 
		 * user3.printUserInfo(); User user4 = new User(12,"krishna");
		 * user4.printUserInfo(); User user5 = new User(12); user5.printUserInfo();
		 */
		 

	}

	static 
	{
		
  System.out.println("In static block2");
		
	}
	static 
	{
		
  System.out.println("In static block1");
		
	}
	
	
	public static void sum()
	{
		System.out.println(78);
		
		
	}
	
	
	
	public void displayName()
	{
		
		
		System.out.println(name);
		
	}
	
	
}
