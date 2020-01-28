package dt25012020;

public class AbstractDemo {

	public static void main(String[] args) {

            // Bank b = new Bank();  // super class abstract 
             Bank hb = new HDFCBank();
             Bank  sb = new SBIBank();
             
            // System.out.println(b.getRateOfIntrest());
             
             System.out.println(hb.getRateOfIntrest());
             
             System.out.println(sb.getRateOfIntrest());
             
		
		
		
	}

}

/*
 * 1) Abstract method - defined with abstract keyword - with out implementation
 * 2) Abstract is a class defined with abstract keywors
 *      a) implemented methods(concrete methods)
 *      b) Unimplemented methods(abstaction)
 *      
 *      Use - Hiding implementation 
 *           abstract
 
*/