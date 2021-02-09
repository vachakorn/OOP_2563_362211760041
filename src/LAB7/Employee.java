package LAB7;

public class Employee {
    //attributes
    private String name;
    private int age;
    private String position;
    private double salary;
    //default constructor
    public Employee(){}
    //assign Constructor
    public Employee(String name, int age, String position, double salary){
        //assign data to class attributes
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;

    }
    //display object data
    public void displayData(){
        System.out.println("Employee Name:"+this.name);
        System.out.println("Employee age:"+this.age);
        System.out.println("Employee position:"+this.position);
        System.out.println("Employee salary:"+this.salary);


    }


}//class
