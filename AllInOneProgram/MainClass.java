package AllInOneProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass {
	static UserData[] user=null;

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t\t\t----------------------------------------");
		System.out.println("\t\t\t\t\tMAIN MENU");
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
			System.out.println("\t\t\t\t\tREGISTER MENU");
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
			System.out.println("\t\t\t\t\tLOGIN MENU");
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
				    System.out.println("LOGIN SUCCESSFULLY !");
				    
				   
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
