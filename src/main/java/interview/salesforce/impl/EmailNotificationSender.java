package interview.salesforce.impl;

import interview.salesforce.iface.NotificationSender;

public class EmailNotificationSender implements NotificationSender{
	
    public void sendNotification(String message, String recipient){
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
