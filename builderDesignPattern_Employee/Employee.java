package builderDesignPattern_Employee;

public class Employee {
    private String name;
    private int age = 0;
    private String address;
    private int idNumber;
    private String position;
    public Employee(String name, int age, String address, int idNumber, String position){
        this.name =name;
        this.age = age;
        this.address = address;
        this.idNumber = idNumber;
        this.position = position;
    }

    @Override
    public String toString(){
        return "Employee [name="+name+", age="+age+", address="+address+", idNumber="+idNumber+", position="+position+"";
    }
}
