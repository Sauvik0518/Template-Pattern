package iit.du.ac.bd;

public class TemplateMain {
	public static void main(String[] args){
		EmailBase email = new EmailYahoo();
		email.SendEmail();
		
		EmailBase email1 = new EmailGoogle();
		email1.SendEmail();
		
	}

}
