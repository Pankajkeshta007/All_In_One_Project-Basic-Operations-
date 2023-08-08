package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import AllInOneProgram.EvenOddClass;
import AllInOneProgram.UserData;
public class Main {

	public static void main(String[] args) throws IOException {
	
		UserData[] user=null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t\t\t----------------------------------------");
		System.out.println("\t\t\t\t\tM A I N   M E N U");
		System.out.println("\t\t\t\t----------------------------------------");
		while(true)
		{
			
		System.out.println("________________________________");
		System.out.println("1.TO REGISTER. \n2.TO LOGIN.");
		System.out.println("ENTER YOUR CHOICE :");
		System.out.println("_________________________________");
		String  Stringchoice = reader.readLine();
		
		
		int  choice = Integer.parseInt(Stringchoice);
		
		switch(choice) {
		case 1:
			
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("\t\t\t\t\tR E G I S T E R    M E N U ");
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("ENTER NUMBER OF USERS TO REGISTER ");
			String n1=reader.readLine();
			int n= Integer.parseInt(n1);
			user=new UserData[n];
			for(int i =0; i<n; i++)
			{
				System.out.println("ENTER USER EMAIL ID :");
				String emailid=reader.readLine();
				System.out.println("ENTER USER PASSWORD :");
				String passwd=reader.readLine();
				int password=Integer.parseInt(passwd);
				UserData userdata = new UserData(emailid, password);
				user[i]=userdata;
				
			}
			System.out.println("YOU HAVE SUCCESSFULLY REGISTERED !");
			break;
		case 2:
			if(user==null) {
				System.out.println("PLEASE REGISTER FIRST ");
				continue;
			}
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("\t\t\t\t\tL O G I N    M E N U ");
			System.out.println("\t\t\t\t----------------------------------------");
			System.out.println("ENTER EMAIL ID :");
		    String email= reader.readLine();
		    System.out.println("ENTER PASSWORD :");
		    String pass=reader.readLine();
		    int passwd = Integer.parseInt(pass);
		    boolean result = false;
		   for( UserData userdata :user) {
			   if(userdata.getEmailId().equals(email) && userdata.getPassword() == passwd) {
				   result=true;
				   
			   
	
		    	
		    }
			   if(result) {
				    System.out.println("\t\tY O U  H A V E  L O G I N   S U C C E S S F U L L Y !");
				    
				    System.out.println("\t\t\t\t---------------------------------------");
				    System.out.println("\t\t\t\t\tOPERATION WINDOW");
				    System.out.println("\t\t\t\t---------------------------------------");
				    System.out.println("1.TO PRINT EVEN/ODD NUMBERS. \n2.TO PRINT PRIME NUMBERS. \n3.TO PRINT ARTMSTRONG NUMBER. \n4.TO PRINT PALINDROMS NUMBERS. \n5. TO PRINT FACTORIAL OF NUMBER.");
				    System.out.println("ENTER YOUR CHOICE :");
				    String ch1=reader.readLine();
				    int ch=Integer.parseInt(ch1);
				    switch(ch) {
				    
				    case 1:
				    	 System.out.println("\t\t\t\t---------------------------------------");
						    System.out.println("\t\t\t\t\tE V E N   O D D   O P E R A T I O N");
						    System.out.println("\t\t\t\t---------------------------------------");
				    	
				    	EvenOddClass.evenOdd();
				    	break;
				    case 2:
				    	 System.out.println("\t\t\t\t---------------------------------------");
						    System.out.println("\t\t\t\t\tP R I M E   N U M B E R   O P E R A T I O N ");
						    System.out.println("\t\t\t\t---------------------------------------");
				    	 break;
				    	
				    case 3:
				    	 System.out.println("\t\t\t\t---------------------------------------");
						    System.out.println("\t\t\t\t\tA R M S T R O N G   N U M B E R   O  P E R A T I O N ");
						    System.out.println("\t\t\t\t---------------------------------------");
						    break;
				    case 4:
				    	 System.out.println("\t\t\t\t---------------------------------------");
						    System.out.println("\t\t\t\t\tP A L I N D R O M   N U M B E R   O P E R A T I O N ");
						    System.out.println("\t\t\t\t---------------------------------------");
						    break;
				    case 5:
				    	 System.out.println("\t\t\t\t---------------------------------------");
						    System.out.println("\t\t\t\t\tF A C T O R I A L  O F   N U M B E R   O P E R A T I O N");
						    System.out.println("\t\t\t\t---------------------------------------");
				    	break;
				    	default :
				    		System.out.println("PLEASE ENTER A VALID CHOICE ");
				    }
				    
				    
				    
				    
				    
				   
			   }
			   else
			   {
				   System.out.println("USER LOGIN FAILED");
			   }
		   }
             break;

			default :
				System.out.println("ENTER A VALID CHOICE ");
		}
		System.out.println("ENTER ANY KEY FOR CONTINUE AND N FOR EXIT");
		String n = reader.readLine();
		if(n.equalsIgnoreCase("N"))
		{
			break;
		}
		}
		System.out.println("\t\t\t\t____________________________");
		System.out.println("\t\t\t\t\tTHANKYOU");
		System.out.println("\t\t\t\t____________________________");
		


	}

}
