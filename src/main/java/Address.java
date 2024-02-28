public class Address {

    public String city;
    public String location;

    public Address(String city, String location) {
        this.city = city;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
