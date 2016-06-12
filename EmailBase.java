package iit.du.ac.bd;

public abstract class EmailBase {
	public void SendEmail(){
		CheckEmailAddress();
		ValidateMessage();
		SendMail();
	}
	
	 abstract void CheckEmailAddress();
	 abstract void ValidateMessage();
	 abstract void SendMail();

}
