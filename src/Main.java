public class Main {
    public static void main(String[] args) {
        SamsungGalaxyS6 samsungGalaxyS6 = new SamsungGalaxyS6(8, "Black", "Plastic", "123456789");

        samsungGalaxyS6.createContact("1234567890", "Andrei", "Stroe");
        samsungGalaxyS6.createContact("9876543210", "Mircea", "Bravo");

        System.out.println("Contacts:");
        samsungGalaxyS6.seeContact();

        samsungGalaxyS6.sendMessage("1234567890", "Ce faci?");
        samsungGalaxyS6.sendMessage("9876543210", "Foarte bine!");
        System.out.println("\nMessages for Andrei Stroe:");
        samsungGalaxyS6.seeMessage("1234567890");

        samsungGalaxyS6.Call("9876543210");

        System.out.println("\nCall history:");
        samsungGalaxyS6.viewHistory();

        System.out.println("\nRemaining battery life: " + samsungGalaxyS6.getBatteryLife() + " hours");
    }
}
