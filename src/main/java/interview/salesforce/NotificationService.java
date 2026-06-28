package interview.salesforce;

public class NotificationService {
	private NotificationSender sender;
	    
	    public NotificationService(NotificationSender sender){
	        this.sender = sender;
	    }
	    
	    public void sendNotification(String message, String recipient){
	        sender.sendNotification(message,  recipient);
	    }

}
