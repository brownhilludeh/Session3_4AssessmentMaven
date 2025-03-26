package cis.module34.entity;


import cis.module34.util.CisUtility;


/**
 * This class will contain information about an employee.  This will contain all
 * of the basic information that all employees would have.  
 *
 * @author BJ
 */
public class Employee {

    private int employeeId;  //Note this is a sequential number assigned when creating an employee.  
    private String name;
    private String dob;
    private double salary;
    private String phoneNumber;
    private String emailAddress;
    private int departmentId;
    private static int nextEmployeeId = 0;
    protected String title = "Employee";
    

    
    public Employee(){
        employeeId = getNextEmployeeId();
        getInformation();
    }

    public Employee(String name, String dob, double salary, String phoneNumber, String emailAddress, int departmentId) {
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.departmentId = departmentId;
    }
    
    public Employee(String firstName, String lastName, String dob, double salary, String phoneNumber, String emailAddress, int departmentId) {
        this.name = firstName+" "+lastName;
        this.dob = dob;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.departmentId = departmentId;
    }
    

    /**
     * Return the next sequential id
     * @since 20230324
     * @author BJM
     */    
    public static int getNextEmployeeId(){
        return ++nextEmployeeId;
    }

    public void getInformation(){
        name = CisUtility.getInputString("Name:");
        dob = CisUtility.getInputString("DOB (yyyy-mm-dd):");
        salary = CisUtility.getInputDouble("Salary:");
        phoneNumber = CisUtility.getInputString("Phone number:");
        emailAddress = CisUtility.getInputString("Email address:");
        departmentId = CisUtility.getInputInt("Department ID:");
    }

    
    public int getEmployeeId() {
        return employeeId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public String getEmailAddress() {
        return emailAddress;
    }

    public double getSalary() {
        return salary;
    }

    public void display(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Employee id: " + employeeId + "\nName: " + name 
                + "\nTitle: "+title
                + "\nDOB: " + dob 
                + "\nSalary: " + CisUtility.toCurrency(salary) 
                + "\nPhone Number: " + phoneNumber 
                + "\nEmail Address: " + emailAddress 
                + "\nDepartment Id: " + departmentId;
    }

    public void showContactInformation() {
        System.out.println("Name: " + name + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress);
    }
    

    
}
