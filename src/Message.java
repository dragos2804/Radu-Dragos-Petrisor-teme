public class Message {

    private String senderPhoneNumber;
    private String content;
    private String receiverPhoneNumber;

    public Message(String senderPhoneNumber, String contact, String receiverPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
        this.content = contact;
        this.receiverPhoneNumber=receiverPhoneNumber;
    }
    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message from " + senderPhoneNumber + " to " + receiverPhoneNumber + ": " + content;
    }


}
