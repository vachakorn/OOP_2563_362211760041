package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

       //default constructor
        Employee emp1 = new Employee();
       //assign constructor
        Employee emp2 = new Employee("Vachakorn Taweechotworakul",22,"Student",12000);

        //call displayData()
        emp1.displayData();
        emp2.displayData();

        //System.out.println(emp2.name);

        //assign data to emp1
        emp1.setName("Vachakorn Taweechotworakul");
        emp1.setAge(22);
        emp1.setPosition("Student");
        emp1.setSalary(20000);

        emp1.displayData();
        System.out.println("Emp name : "+emp1.getName());


    }//main
}//class
