package dt03012020;

import java.util.Scanner;

public class TwoDimentionalArrays {

	public static void main(String[] args) {


		/*
		 *  1(0,0) 2 (0,1)
		 *  3(1,0) 4(1,1)
		 */
		
		int x[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The Array Elements are");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}

	}

}
