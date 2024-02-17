package abc;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// 4! = 4x3x2x1
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number");
		    int a =sc.nextInt();
		 
		int fact=1;
		
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
					
		}
		System.out.println("The factorial of a number is "+ fact);
		
		
	}
	

}
