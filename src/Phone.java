public interface Phone {

    void createContact(String phoneNumber, String firstName , String lastName);
    void seeContact();
    void sendMessage(String phoneNumber,String Message);
    void seeMessage(String phoneNumber);
    void Call(String phoneNumber);
    void viewHistory();

}
