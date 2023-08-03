package builderDesignPattern_Employee;

public class AddEmployee {
    public static void main(String[] ars){
        Employee kavindu = new EmployeeBuilder().setName("Kavindu").setAge(24).getEmployee();
        System.out.println(kavindu);
    }
}
