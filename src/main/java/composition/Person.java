package composition;

public class Person {

    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard){
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void moveTo(Address address){
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public String getName() {
        return name;
    }

    public String personToString() {
        return getName() + ", " +getIdentificationCard();
    }
}
