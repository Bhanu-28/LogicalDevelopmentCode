package interview.salesforce;

public class CodingAssesment {
	
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	// public class NotificationService {

	//   public void sendNotification(String type, String message, String recipient) {

//	       if (type.equals("EMAIL")) {
//	           System.out.println("Sending email to " + recipient + ": " + message);
//	       } else if (type.equals("SMS")) {
//	           System.out.println("Sending SMS to " + recipient + ": " + message);
//	       } else if (type.equals("PUSH")) {
//	           System.out.println("Sending push notification to " + recipient + ": " + message);
//	       }
	//   }
	// }

	
	    
	    
	    public static void main(String[] args){
	    	
	        NotificationSender sender1 = new EmailNotificationSender();
	        
	        NotificationService service1 = new NotificationService(sender1);
	        
	        service1.sendNotification("Welcome to email messaging of salesforce","salesforce1.com");
	        
	        
	        NotificationSender sender2 = new WhatsAppNotificationSender();
	        
	        NotificationService service2 = new NotificationService(sender2);
	        
	        service2.sendNotification("Welcome to Whatsapp messaging of salesforce","123456789");
	        
	    }
	}





