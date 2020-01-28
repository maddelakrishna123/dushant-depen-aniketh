package dt16012020;

public class User {
	
	
	
	
	
	
	
	
	
	static 
	{
		System.out.println("static block in User Class");
		
	}
	// instance variable
	int id;
	String name;
	String mobile;
	String email;
	static String college="AX College";
	// Contructor

	public User()
	{
		super();
		System.out.println(" 0 argument constructor is called");
		
		id = 10;
		name ="krishna";
		mobile ="7660015761";
		email ="krishna@gmail.com";
		
	}
	
	
	public User(int id)
	{
		
		this.id = id;
		
		
		
		//System.out.println("1 Argument Costructor is called");
	}

	public User(int id , String  name)
	{
		this(id);
		/* this.id = id; */
		this.name = name;
		
		
		//System.out.println("2 Argument Costructor is called");
	}
	
	
	
	public User(int id , String  name, String  mobile)
	{
		
		this(id,name);
		/*
		 * this.id = id; this.name = name;
		 */
		this.mobile = mobile;
		
		//System.out.println("3 Argument Costructor is called");
	}
	
	
	public User(int id , String  name, String  mobile, String email)
	{
		
		this(id,name,mobile); // call to three argu constr
		
		/*
		 * this.id = id; this.name = name; this.mobile = mobile;
		 */
		this.email = email;
		
		//System.out.println("4 Argument Costructor is called");
	}
	
	// method 
	
	
	public  void printUserInfo()
	{
		System.out.println(id +" , "+name+" , "+mobile+" , "+email+"  , "+college);
		
	}
	
	
	
	

}
