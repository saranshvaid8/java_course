package chapter6;

public class Employee extends Person {

    //<editor-fold desc="Private Members">
    private String employeeId;
    private String employeeTitle;
    //</editor-fold>

    //<editor-fold desc="Getter & Setters">
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }
    //</editor-fold>



    //<editor-fold desc="Constructor">
    public Employee() {
        super("Sunny","Vaid");
        System.out.println("This is a parameterless employee");
    }
    //</editor-fold>

}
