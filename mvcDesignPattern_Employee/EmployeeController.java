package mvcDesignPattern_Employee;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model =model;
        this.view =view;
    }

    public void setEmployeeName(String name) {
        this.model.setName(name);
    }

    public String getEmployeeName(){
        return model.getName();
    }

    public void setEmployeeRoleNumber(String rollNumber){
        this.model.setRolNo(rollNumber);
    }

    public String getEmployeeRoleNumber(){
        return model.getRolNo();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(),model.getRolNo());
    }


}
