import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Person> personNameSet = new TreeSet<>(new PersonNameComparator());

        personNameSet.add(new Person(28, "Andrei"));
        personNameSet.add(new Person(24, "Matei"));
        personNameSet.add(new Person(30, "Ioana"));

        System.out.println();
        System.out.println("Persoane sortate dupa nume:");
        System.out.println();
        for(Person person : personNameSet){
            System.out.println(person);
                    }
        Set<Person> personAgeSet = new TreeSet<>(new PersonAgeComparator());

        personAgeSet.add(new Person(28, "Andrei"));
        personAgeSet.add(new Person(24, "Matei"));
        personAgeSet.add(new Person(30, "Ioana"));

        System.out.println();
        System.out.println("Persoane sortate dupa varsta:");
        System.out.println();
        for(Person person : personAgeSet){
            System.out.println(person);
        }

        Map<Person , List<Hobby>> personHobbiesMap = new HashMap<>();

        List<Address> cyclingAddress = Arrays.asList(new Address("Bucuresti","Parc Cismigiu"), new Address("Constanta","Faleza"));
        List<Address> swimmingAddress = Arrays.asList(new Address("Constanta","Marea Neagra"), new Address("Bucuresti","Divertiland"));

        personHobbiesMap.put(new Person(28,"Andrei"),Arrays.asList(new Hobby("Ciclism",5,cyclingAddress)));
        personHobbiesMap.put(new Person(30,"Ioana"),Arrays.asList(new Hobby("Inotator",3,swimmingAddress)));

        System.out.println();
        System.out.println("Hobby-uri si orasul unde pot fi practicate");

        for(Map.Entry<Person,List<Hobby>> entry : personHobbiesMap.entrySet()){
            Person person = entry.getKey();
            List<Hobby> hobbies = entry.getValue();

            System.out.println();
            System.out.println("Hobby-urile lui " + person.name);

            for(Hobby hobby : hobbies){
                System.out.println("-" + hobby.name + " " + "practicat" + " " + hobby.frequency + " " + "ore pe saptamana");
                System.out.println();
                System.out.println("Poate fi practicat in:");
                for(Address address : hobby.addresses){
                    System.out.println(" "+ address.city);
                }
            }
        }
    }
}
