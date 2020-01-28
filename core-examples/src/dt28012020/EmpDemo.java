package dt28012020;

public class EmpDemo {

	public static void main(String[] args) {

               Employee emp = new Employee(123,"krishna",3000.00);
               
               Employee emp1 = new Employee(123,"krishna",3000.00);
              
               
               
               
               //System.out.println(emp.getId() +" "+emp.getName() +" "+emp.getSalary());
              // System.out.println(emp);
             //  System.out.println(emp1);
               
               
               System.out.println(emp.equals(emp)); // true //reflextive
               
               System.out.println(emp.equals(emp1)); // false  // symmetric
               System.out.println(emp1.equals(emp)); // false
               
                    //  a b c = a =b  b =c   the n a =c
          
              
		
		
		
		

	}

}
