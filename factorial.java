import java.io.*;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.print("Please enter an positive integer to calculate its factorial(n!) : ");
		int num=input.nextInt();
		System.out.println(num);
		int total=factorial(num);
		System.out.println("The factorial of "+num+" is: "+total);
	}
	
	
	public static int factorial(int num)
	{int fac=1;
		if(num==0)
			{return  1;}
		else
			{return(num*factorial(num-1)); 
					}
		
		//return fac;
	}
	
	}
