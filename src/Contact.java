public class Contact {

    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact( String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Contact: " + firstName + " " + lastName + " (" + phoneNumber + ")";
    }
}
