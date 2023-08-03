package mvcDesignPattern_Employee;

public class MVCDemo {
    public static void main(String[] args) {
        Employee employee= retrieveEmp();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        employeeController.updateView();

        employeeController.setEmployeeName("Kavindu Prabhashitha");
        employeeController.updateView();
    }

    private static Employee retrieveEmp(){
        Employee employee = new Employee();
        employee.setName("Kavindu");
        employee.setRolNo("20");
        return employee;
    }
}
