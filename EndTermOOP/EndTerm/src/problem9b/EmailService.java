package problem9b;

public class EmailService {
	 private EmailSender emailSender;

	 public EmailService(EmailSender emailSender) {
	     this.emailSender = emailSender;
	 }

	 public void sendNotificationEmail(String recipient, String message) {
	     emailSender.sendEmail(recipient, "Notification", message);
	 }
	}
