package LAB8;

public class Employee extends person{

    //Class Attributes
    private String EmpID;//รหัสพนักงาน
    private String Position;//ตำแหน่ง
    private double salary;//เงินเดือน

    //Constructor
    public Employee() {
    }

    public Employee(String pid, String name, int age, String gender, String tel, String empID, String position, double salary) {

        //calling constructor of super-class
        super(pid, name, age, gender, tel);
        EmpID = empID;
        Position = position;
        this.salary = salary;
    }

    //getter and setter
    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String empID) {
        EmpID = empID;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString
    @Override
    public String toString() {
        return "Employee{" +
                "EmpID='" + EmpID + '\'' +
                ", Position='" + Position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
