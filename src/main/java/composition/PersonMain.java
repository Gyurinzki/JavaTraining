package composition;

public class PersonMain {

    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();

        Person person = new Person("John Doe", "AB1212");
        Address address =new Address("Magyarország", "Budapest", "Budafoki út 56. 3. emelet", "H-1117");
        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("John Doe", "AK4747");
        System.out.println(person.personToString());

        person.getAddress().correctData("Magyarország", "Budapest", "RAndom cim", "RAndom ZIP");
        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Hun", "MIskolc", "Lekésellak 11", "H-234");

        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());




    }

}
