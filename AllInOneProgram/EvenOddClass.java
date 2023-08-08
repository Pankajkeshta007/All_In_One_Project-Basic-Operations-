package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenOddClass {
public static  void evenOdd() throws IOException
{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("1.EVEN/ODD OF SINGLE NUMBER. \n2.EVEN/ODD WITHIN RANGE.");
	System.out.println("ENTER YOUR CHOICE :");
	String ch1=reader.readLine();
	int ch=Integer.parseInt(ch1);
	switch(ch)
	{
	case 1:
		
	
		
		System.out.println("ENTER A NUMBER TO CHECK FOR EVEN AND ODD:");
		String num = reader.readLine();
		int a = Integer.parseInt(num);
		if(a%2==0)
		{
			System.out.println("NUMBER IS EVEN");
			
		}
		else
		{
			System.out.println("NUMBER IS ODD");
		}
		break;
	case 2:
		
		int r;
		System.out.println("ENTER A RANGE OF NUMBERS FOR CHECKING EVEN ODD :"); 
		System.out.println("ENTER LOWER LIMIT OF NUMBER :");
		String  n1=reader.readLine();
        int lowerLimit = Integer.parseInt(n1);
        System.out.println("ENTER UPPER LIMIT OF NUMBER :");
        String n2=reader.readLine();
        int upperLimit = Integer.parseInt(n2);
       
        System.out.println("EVEN NUMBERS FROM " + lowerLimit + " TO "+ upperLimit);
        for(int i=lowerLimit; i<=upperLimit; i++)
        {
        	if(i%2==0)
        	{
        		System.out.println(i);
        	}
        }
       
        System.out.println("ODD NUMBERS FROM "+ lowerLimit+" TO "+ upperLimit);
       
        for(int j = lowerLimit; j<=upperLimit; j++)
        {
        	r=j%2;
        	 if(r!=0)
        	 {
        		 System.out.println(j);
        	 }
        }
		default:
			System.out.println("PLEASE ENTER A VALID CHOICE");
	}
	
}

}

