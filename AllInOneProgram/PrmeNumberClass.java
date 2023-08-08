package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrmeNumberClass {
	public static void  primeNumber() throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1.PRIME  OF SINGLE NUMBER. \n2.PRIME NUMBER  WITHIN RANGE.");
		System.out.println("ENTER YOUR CHOICE :");
		String ch1=reader.readLine();
		int ch=Integer.parseInt(ch1);
		switch(ch)
		{
		case 1:
			boolean flag =false;
			System.out.println("ENTER A NUMBER TO CHECK FOR PRIME NUMBER :");
			String n=reader.readLine();
			int num=Integer.parseInt(n);
			
			
			for(int i=2; i<=num/2; ++i)
			{
				if(num%i==0)
					flag=true;
				break;
			}
				if(flag)
				{
					System.out.println("NUMBER IS NONPRIME");
				}
				else
				{
					System.out.println("NUMBER IS PRIME");
				}
			break;
		case 2:
			System.out.println("PRIME NUMBER WITHIN GIVEN RANGE:");
			System.out.println("ENTER LOWER LIMIT :");
			String num1=reader.readLine();
			int lowerLimit=Integer.parseInt(num1);
			System.out.println("ENTER UPPER LIMIT :");
			String num2=reader.readLine();
			int upperLimit=Integer.parseInt(num2);
			System.out.println("PRIME NUMBER FROM "+lowerLimit+" TO "+upperLimit);
			 for (int i = lowerLimit; i <= upperLimit; i++) {
			       if (i%2!=0)
			       {
			        System.out.println (i);
			    
			 }
			 }
			       break;
			
		
			default :
				System.out.println("PLEASE ENTER A VALID CHOICE ");
		}
		
	}
		
	
	

}
