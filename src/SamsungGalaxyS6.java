class SamsungGalaxyS6 extends abstractPhone {
    public SamsungGalaxyS6(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
    }

    @Override
    public void createContact(String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(phoneNumber, firstName, lastName);
        getContacts().add(contact);
    }

    @Override
    public void seeContact() {
        System.out.println("Contacts:");
        for (Contact contact : getContacts()) {
            System.out.println(contact);
        }
    }

    @Override
    public void seeMessage(String phoneNumber) {
        System.out.println("Messages for " + phoneNumber + ":");
        for (Message message : getMessages()) {
            if (message.getSenderPhoneNumber() != null && message.getReceiverPhoneNumber() != null &&
                    (message.getSenderPhoneNumber().equals(phoneNumber) || message.getReceiverPhoneNumber().equals(phoneNumber))) {
                System.out.println(message);
            }
        }
    }

    @Override
    public void viewHistory() {
        System.out.println("Call history:");
        for (String call : getCallHistory()) {
            System.out.println(call);
        }
    }
}