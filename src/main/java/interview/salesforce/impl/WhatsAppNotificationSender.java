package interview.salesforce.impl;

import interview.salesforce.iface.NotificationSender;

public class WhatsAppNotificationSender implements NotificationSender{
    public void sendNotification(String message, String recipient){
        System.out.println("Sending whatsapp message to " + recipient + ": " + message);
    }
}