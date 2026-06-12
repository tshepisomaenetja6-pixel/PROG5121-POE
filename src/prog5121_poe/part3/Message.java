package prog5121_poe.part3;

public class Message {

    private String messageID;
    private String recipient;
    private String messageText;
    private String messageHash;
    private String flag;

    public Message(String messageID, String recipient, String messageText, String flag) {
        this.messageID = messageID;
        this.recipient = recipient;
        this.messageText = messageText;
        this.flag = flag;
        this.messageHash = createMessageHash();
    }

    public String getMessageID() {
        return messageID;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getMessageHash() {
        return messageHash;
    }

    public String getFlag() {
        return flag;
    }

    public boolean checkMessageLength() {
        return messageText.length() <= 250;
    }

    public boolean checkRecipientCell() {
        return recipient.startsWith("+27") && recipient.length() == 12;
    }

    public String createMessageHash() {
        return messageID + ":" + recipient.substring(recipient.length() - 3);
    }
}