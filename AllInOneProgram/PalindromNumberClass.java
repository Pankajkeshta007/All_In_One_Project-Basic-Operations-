package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromNumberClass {
	private static boolean isPalindrome(int i) {
        int rev = 0;
        int tmp = i;
        while (tmp > 0) {
            int digit = tmp % 10;
            rev = rev * 10 + digit;
            tmp /= 10;
        }

        return i== rev;
    }
	public static void palindromeNumber() throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1.PALINDROME OF  NUMBER. \n2.PALINDROME NUMBER  WITHIN RANGE.");
		System.out.println("ENTER YOUR CHOICE :");
		String ch1=reader.readLine();
		int ch=Integer.parseInt(ch1);
		switch(ch)
		{
		case 1:
			
	        System.out.print("ENTER A NUMBER :  ");
	        String n= reader.readLine();
	        int number = Integer.parseInt(n);

	        int reverse = 0;
	        int temp = number;
	        while (temp > 0) {
	            int digit = temp % 10;
	            reverse = reverse * 10 + digit;
	            temp /= 10;
	        }

	        if (number == reverse) {
	            System.out.println("THE NUMBER IS PALINDROME ");
	        } 
	        else
	        {
	            System.out.println("THE NUMBER IS NOT PALINDROME ");
	        }
			break;
		case 2:
			System.out.println("PALINDROME NUMBER WITHIN GIVEN RANGE:");
			System.out.println("ENTER LOWER LIMIT :");
			String num1=reader.readLine();
			int lowerLimit=Integer.parseInt(num1);
			System.out.println("ENTER UPPER LIMIT :");
			String num2=reader.readLine();
			int upperLimit=Integer.parseInt(num2);
			System.out.println("PALINDROME  NUMBER FROM "+lowerLimit+" TO "+upperLimit);
			 for (int i = lowerLimit; i <= upperLimit; i++) {
				 if (isPalindrome(i)) {
		                System.out.println(i);
		            }
				
			 }
			
			break;
			default :
				System.out.println("PLEASE ENTER A VALID CHOICE ");
		}
		
	}

	
	}



