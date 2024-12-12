package Employee;

public class Methods {

    private String name;
    int hiringYear;
    int salary;


    public Methods(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public void setHiringYear(int hiringYear) {
        this.hiringYear = hiringYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Név: " + this.name + " Belépés ideje: " + this.hiringYear + " Fizetése: " + this.salary;
    }
}
