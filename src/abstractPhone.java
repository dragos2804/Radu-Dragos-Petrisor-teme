import java.util.ArrayList;
import java.util.List;

abstract class abstractPhone implements Phone {
    private List<Contact> contacts;
    public List<Message> messages;
    private List<String> callHistory;
    private int batteryLife;
    private String phoneNumber;
    private String color;
    private String material;
    private String IMEI;

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<String> getCallHistory() {
        return callHistory;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getIMEI() {
        return IMEI;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public abstractPhone(int batteryLife, String color, String material, String IMEI) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.callHistory = new ArrayList<>();

    }

    public void decreaseBatteryLife(int hours) {
        this.batteryLife -= hours;
        if (batteryLife < 0) {
            batteryLife = 0;
        }

    }

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        decreaseBatteryLife(1);
        Message message = new Message(getPhoneNumber(), phoneNumber, messageContent);
        messages.add(message);
    }


    @Override
    public void Call(String phoneNumber) {
        decreaseBatteryLife(2);
        callHistory.add("Call to " + phoneNumber);
    }

    @Override
    public void seeMessage(String phoneNumber) {
        System.out.println("Messages for " + phoneNumber + ":");
        for (Message message : messages) {
            if (message.getSenderPhoneNumber().equals(phoneNumber) || message.getReceiverPhoneNumber().equals(phoneNumber)) {
                System.out.println(message);
            }
        }
    }
}