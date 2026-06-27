package interview.salesforce.service;

import interview.salesforce.iface.NotificationSender;

public class NotificationService {
	private NotificationSender sender;
	    
	    public NotificationService(NotificationSender sender){
	        this.sender = sender;
	    }
	    
	    public void sendNotification(String message, String recipient){
	        sender.sendNotification(message,  recipient);
	    }

}
