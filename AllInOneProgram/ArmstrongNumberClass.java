package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArmstrongNumberClass {

	public static void armstrongNumber() throws IOException
	{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("1.ARMSTRONG OF  SINGLE NUMBER. \n2.ARMSTRONG NUMBER  WITHIN RANGE.");
	System.out.println("ENTER YOUR CHOICE :");
	String ch1=reader.readLine();
	int ch=Integer.parseInt(ch1);
	switch(ch)
	{
	case 1:
		// TODO Auto-generated method stub

System.out.println("ENTER A NUMBER :");
String n1=reader.readLine();
int number = Integer.parseInt(n1);

        int  originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " IS ARMSTRONG NUMBER.");
        else
            System.out.println(number + " IS NOT ARMSTRONG NUMBER.");
		break;
	case 2:
		System.out.println("ENTER LOWER LIMIT :");
		String num1=reader.readLine();
		int lowerLimit=Integer.parseInt(num1);
		System.out.println("ENYTER UPPER LIMIT :");
		String num2 = reader.readLine();
		int upperLimit = Integer.parseInt(num2);
		System.out.println("ARMSTRONG NUMBER BETWEEN"+lowerLimit+ " AND "+upperLimit);
		for (int i = lowerLimit; i <= upperLimit; i++) {
            int originalNumber1 = i;
            int sumOfDigits = 0;
            int power = (int) Math.log10(i) + 1;

            while (originalNumber1 > 0) {
                int digit = originalNumber1 % 10;
                sumOfDigits += digit * digit * digit;
                originalNumber1 /= 10;
            }

            if (sumOfDigits == i) {
                System.out.println(i);
            }
            else
            {
            	System.out.println("NO ARMSTRONG NUMBER WITHIN A GIVEN RANGE ");
            	
            }
        }
		break;
		default:
			System.out.println("PLEASE ENTER A VALID CHOICE ");
			
	
	}
	}
}
