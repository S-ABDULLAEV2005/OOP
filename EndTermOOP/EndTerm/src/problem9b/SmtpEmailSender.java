package problem9b;

public class SmtpEmailSender implements EmailSender {
	 public void sendEmail(String to, String subject, String body) {
	     System.out.println("Sending email via SMTP to: " + to);
	     System.out.println("Subject: " + subject);
	     System.out.println("Body: " + body);
	 }
	}
