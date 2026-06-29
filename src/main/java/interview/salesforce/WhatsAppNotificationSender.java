package interview.salesforce;

public class WhatsAppNotificationSender implements NotificationSender{
    public void sendNotification(String message, String recipient){
        System.out.println("Sending whatsapp message to " + recipient + ": " + message);
    }
}