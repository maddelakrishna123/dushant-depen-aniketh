package dt25012020;

public abstract class Bank {
	
	
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	

	public void deposit()
	{
		System.out.println("deposit");
	}

	
	public abstract int getRateOfIntrest();
	
	//public abstract int add(int a, int b);
}
