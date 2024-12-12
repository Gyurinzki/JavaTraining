package Employee;

public class EmployeeMain {


    public static void main(String[] args) {

        Methods employee = new Methods("Kiss Lajos", 2022, 500000);
        System.out.println(employee);

       employee.setSalary(600000);
        System.out.println(employee);

    }

}
