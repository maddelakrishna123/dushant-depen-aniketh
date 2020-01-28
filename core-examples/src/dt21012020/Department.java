package dt21012020;

public class Department {
	
	private String depetName;
	private String deptLocation;
	
	
	
	// constructor
	
	
	public Department() {
		super();
	}






	public Department(String depetName, String deptLocation) {
		super();
		this.depetName = depetName;
		this.deptLocation = deptLocation;
	}






	public String getDepetName() {
		return depetName;
	}






	public void setDepetName(String depetName) {
		this.depetName = depetName;
	}






	public String getDeptLocation() {
		return deptLocation;
	}






	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
	
	
	

	
	
	/**
	 * this method return Department Object
	 * @return
	 */
	
	public static Department getDepartment()
	{
		Department d = new Department();
		
		
		return  d;
		
	}
	
	/**
	 * 
	 * @param name
	 * @param loc
	 * @return
	 */
	public static Department getDepartment(String name,String loc)
	{
		Department d = new Department(name,loc);
		
		
		return  d;
		
	}
	
	

	
	

}
