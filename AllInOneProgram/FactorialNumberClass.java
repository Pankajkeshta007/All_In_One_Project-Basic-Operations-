package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialNumberClass {
	private static  int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
	public static void factorialNumber() throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1.FACTORIAL  OF  SINGLE NUMBER. \n2.FACTORIAL OF  NUMBER  WITHIN RANGE.");
		System.out.println("ENTER YOUR CHOICE :");
		String ch1=reader.readLine();
		int ch=Integer.parseInt(ch1);
		switch(ch)
		{
		case 1:
			System.out.println("ENTER NUMBER :");
			String n=reader.readLine();
			int number = Integer.parseInt(n);
			int factorial = 1;

			for (int i = 1; i <= number; i++) {
	            factorial *= i;
			}
			System.out.println("FACTORIAL OF NUMBER IS :"+factorial);
			break;
	case 2:
			System.out.println("ENTER START OF RANGE :");
			String n1=reader.readLine();
			int start=Integer.parseInt(n1);
			System.out.println("ENTER END OF RANGE :");
			String n2= reader.readLine();
			int end = Integer.parseInt(n2);
			System.out.println("FACTORIAL OF NUMBER FROM "+start+" TO "+end);
			for (int i = start; i <= end; i++) {
	            System.out.println(  i + " =: " + factorial(i));
	        }
			
			break;
			
			default:
				System.out.println("PLEASE ENTER A VALID CHOICE ");
		}
	}

}
