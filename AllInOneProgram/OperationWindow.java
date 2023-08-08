package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationWindow {
	public static void operationWindowChoices() throws IOException 
	
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("\n\n\n\n\t\t\t\t---------------------------------------");
	    System.out.println("\t\t\t\t\tO P E R A T I O N   W I N D O W ");
	    System.out.println("\t\t\t\t---------------------------------------");
	    while(true)
	    {
	    System.out.println("1.TO PRINT EVEN/ODD NUMBERS. \n2.TO PRINT PRIME NUMBERS. \n3.TO PRINT ARTMSTRONG NUMBER. \n4.TO PRINT PALINDROMS NUMBERS. \n5. TO PRINT FACTORIAL OF NUMBER.");
	    System.out.println("ENTER YOUR CHOICE :");
	    String ch1=reader.readLine();
	    int ch=Integer.parseInt(ch1);
	    switch(ch) {
	    
	    case 1:
	    	 System.out.println("\t\t\t\t--------------------------------------------");
			    System.out.println("\t\t\t\t\tE V E N   O D D   O P E R A T I O N");
			    System.out.println("\t\t\t\t-----------------------------------------");
	    	EvenOddClass.evenOdd();
	    	
	    	break;
	    case 2:
	    	 System.out.println("\t\t\t\t------------------------------------------------------");
			    System.out.println("\t\t\t\t\tP R I M E   N U M B E R   O P E R A T I O N ");
			    System.out.println("\t\t\t\t----------------------------------------------------");
			    PrmeNumberClass.primeNumber();
	    	 break;
	    	
	    case 3:
	    	 System.out.println("\t\t\t\t--------------------------------------------------------------");
			    System.out.println("\t\t\t\t\tA R M S T R O N G   N U M B E R   O  P E R A T I O N ");
			    System.out.println("\t\t\t\t------------------------------------------------------------");
			    ArmstrongNumberClass.armstrongNumber();
			    break;
	    case 4:
	    	 System.out.println("\t\t\t\t---------------------------------------------------------------");
			    System.out.println("\t\t\t\t\tP A L I N D R O M E   N U M B E R   O P E R A T I O N ");
			    System.out.println("\t\t\t\t-------------------------------------------------------------");
			    PalindromNumberClass.palindromeNumber();
			    break;
	    case 5:
	    	 System.out.println("\t\t\t\t----------------------------------------------------------------");
			    System.out.println("\t\t\t\t\tF A C T O R I A L  O F   N U M B E R   O P E R A T I O N");
			    System.out.println("\t\t\t\t-------------------------------------------------------------");
			    FactorialNumberClass.factorialNumber();
	    	break;
	    	default :
	    		System.out.println("PLEASE ENTER A VALID CHOICE ");
	    }
	    System.out.println("DO YOU WANT TO CONTINUE Y/N");
	    String no=reader.readLine();
	    if(no.equalsIgnoreCase("N"))
	    {
	    	break;
	    }
	    
	}

	}
}