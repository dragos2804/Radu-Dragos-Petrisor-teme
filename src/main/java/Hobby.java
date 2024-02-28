import java.util.List;

public class Hobby {

    String name;
    int frequency;
    List<Address> addresses;

    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }
}
