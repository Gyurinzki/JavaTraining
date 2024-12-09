package training;

public class Trainer {

    String name;
    private int YearOfBirth;

    public String getName() {
        return name;
    }

    public  String getNameAndYearofBirth() {
        return name + " " + YearOfBirth;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }
}

