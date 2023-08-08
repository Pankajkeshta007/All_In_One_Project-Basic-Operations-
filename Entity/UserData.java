package Entity;

public class UserData {
        private  String emailId;
        private int password;
        
        public UserData(String emailid, int password)
        {
        	
        	this.emailId=emailid;
        	this.password=password;
        }


		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public int getPassword() {
			return password;
		}

		public void setPassword(int password) {
			this.password = password;
		}

        
}



