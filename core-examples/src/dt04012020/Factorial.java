package dt04012020;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter Any Integer");
int num = sc.nextInt();

int fact = Fact.factorial(num);


Fact f = new Fact();
f.div(12,3);

System.out.println(num+" ! = "+fact);

	}

}
