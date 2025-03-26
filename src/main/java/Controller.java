
import cis.module34.entity.Department;
import cis.module34.entity.Company;
import cis.module34.entity.Employee;
import cis.module34.entity.Manager;
import cis.module34.util.Utility;
import java.util.HashMap;


/**
 * This program will provide 10 small activities which will need fixing or
 * completing. This will focus on practicing object oriented and inheritance
 * principles. The details are specified in comments inside the program.
 *
 * @author BJ
 * @since 20140310
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    private static Company theCompany = new Company();

    public static void main(String[] args) {

        //****************************************************************************
        // This is the String used to dislay menu to the user.
        //****************************************************************************
        
        String menu = "CIS Company Main Menu\n"
                + "D-Create a new department\n"
                + "E-Add a new employee\n"
                + "S-Show employees for a given department\n"
                + "L-Look up an employee\n"
                + "B-Show employees with a birthday this month\n"
                + "VE-Show all employees\n"
                + "VD-Show all departments\n"
                + "X-Exit\n";
        String option;
        
        //******************************************************************************************
        //TODO DONE Issue 1A - Fix syntax issue - Create constructor
        //Create a custom constructor for the Department class which will work for the
        //following code.  Have to make the constructor in Department which will accept the four
        //parameters and set the instance attributes in the class.  The code below will then add the 
        //object to the HashMap in the Company object which was declared above.
        //******************************************************************************************        
        
        theCompany.getDepartments().put("1", new Department(1,"CIS", 10000.0, 1));
        theCompany.getDepartments().put("2", new Department(2,"Adult Education", 6000.0, 2));
        
        //******************************************************************************************
        //TODO DONE Issue 1D - Department (constructor/getInformation)
        //Create a default constructor for the Department class.  Also create a 
        // getInformation method.  These should be invoked when the D option is chosen.
        //******************************************************************************************
        
        //******************************************************************************************
        //TODO DONE Issue 2A - remove final
        //Modify the Employee class declaration as needed to allow Manager to inherit from it.  Modify the Manager
        //class to correctly inherit from Employee.
        //******************************************************************************************

        //******************************************************************************************
        //TODO DONEIssue 2B - new type of Employee
        //Create an Instructor class which is the same as an employee but that has an appropriate title.
        //******************************************************************************************

        //******************************************************************************************
        //TODO DONE Issue 2C - another new type of Employee
        //Create an Administrator class which is the same as an employee but that has an appropriate title.
        //******************************************************************************************
        
        //******************************************************************************************
        //TODO Issue 3A - getInformation for new classes
        //Create a method to get details for the three classes created in issue#2.  This method should
        //prompt the user for the required information. 
        //******************************************************************************************        
        
        //******************************************************************************************
        //TODO Issue 3B - Add a new Employee to the company
        //Create a method in the Company class that will run whenever E is selected.  This method should
        //prompt the user for the type of Employee to create, call the appropriate constructor, get information
        //for the object, and add the object to the employees collection.  Make 
        //sure this method is invoked when E is selected.
        //******************************************************************************************                
        
        //******************************************************************************************
        //TODO Issue 3C - Create custom constructors
        // Create custom constructors (Employee, Manager, Instructor, Administrator) that will work 
        // with the following code.  The constructors should assign the next available employee id 
        // when an employee is created.  Create the constructor so that it accepts the parameters as 
        // indicated below.  Should not have to modify the code below after the constructors are created correctly
        //
        //After making changes above, uncomment the following code.  Should work as is.
        //first name, last name, date of birth, salary, phone#, email, dept id
        //******************************************************************************************
        
        //***********************************************
        //Department1
        //***********************************************

//        theCompany.getEmployees().add(new Administrator("Cathy", "MacDonald", "1972-04-01", 44000, "555-1111","cmac@cis.com", 1));
//        theCompany.getEmployees().add(new Instructor("Don", "Bowers", "1972-10-01", 34000, "555-1112","dbow@cis.com", 1));
//        theCompany.getEmployees().add(new Instructor("Mike", "MacDonald", "1962-06-11", 64000, "555-1113","mmac@cis.com", 1));
//        theCompany.getEmployees().add(new Instructor("Bill", "Lewis", "1980-04-21", 64000, "555-1114","jsmith@cis.com", 1));
        theCompany.getEmployees().add(new Employee("George", "Duncan", "1981-08-31", 49000, "555-1115","jsmith@cis.com", 1));
        theCompany.getEmployees().add(new Manager("Paul", "Murnaghan", "1980-04-21", 74000, "555-1121","pmurn@cis.com", 1));

        //***********************************************
        //Department2
        //***********************************************

//        theCompany.getEmployees().add(new Administrator("John", "Atkins", "1972-04-01", 44000, "555-1116","jsmith@cis.com", 2));
//        theCompany.getEmployees().add(new Instructor("Stephan", "Craig", "1972-10-01", 34000, "555-1117","jsmith@cis.com", 2));
//        theCompany.getEmployees().add(new Instructor("Mike", "Murphy", "1962-06-11", 64000, "555-1118","jsmith@cis.com", 2));
//        theCompany.getEmployees().add(new Instructor("Will", "MacLean", "1980-04-21", 64000, "555-1119","jsmith@cis.com", 2));
//        theCompany.getEmployees().add(new Employee("Andrew", "Sentner", "1981-08-31", 49000, "555-1120","jsmith@cis.com", 2));
//        theCompany.getEmployees().add(new Manager("Natalie", "Worthen", "1991-11-14", 55000, "555-1122","jsmith@cis.com", 2));


        //******************************************************************************************
        //TODO DONE Issue 4 - Report of birthdays
        //Get any people that have a birthday this month.  Display the names and birthdays of anyone with
        //a birthday in the current month.  This could be a method in the Company class.  
        //Notes:
        // - should be an instance method.  
        // - could display the information and return void
        //******************************************************************************************

        //******************************************************************************************
        //TODO Issue 5 - Lookup an employee
        //Write a method which will allow you to look up a person.  User should enter a name the 
        //program should show the person's phone number and email address.  A method could be created
        //that displays only contact information (instead of the toString which may display everything).
        //Note
        // - again this could be a method in the company class which is invoked when processing menu option.
        // - The method could return a String of the information OR display the information and return void.
        //******************************************************************************************

        //******************************************************************************************
        //TODO Issue 6 - show employees of a department
        //Write a method which will show all of the employees of a department.  The user should enter
        //the department name and then all of the appropriate employees are shown.  Make sure that the 
        //toString method is overridden for each class and use it to display employee information.  
        //Note:
        // - eliminate code duplication.
        //******************************************************************************************

        //******************************************************************************************
        //TODO Issue 7 - get email adddresses for employees of a manager
        //Get all of the email addresses of the employees that work for a given manager.  
        //******************************************************************************************

        //******************************************************************************************
        //TODO Issue 8
        //We want to add a constant job title in each class that is derived from Employee.
        //Add a title which hides the title of the base class.  This could be used when displaying 
        //information about the class.  
        //******************************************************************************************

        //***************************************************************************
        // Present the menu to the use until they choose to eXit.
        //***************************************************************************
        do {
            System.out.println(menu);
            option = Utility.getInput().nextLine();
            System.out.println("-----------------------------------\n");
            System.out.println("-----   Option " + option + "-------------------\n");
            System.out.println("-----------------------------------\n");

            switch (option.toUpperCase()) {
                case "D":
                    System.out.println("Create a new department");
                    Department department = new Department();
                    department.getInformation();
                    HashMap departmentsMap = theCompany.getDepartments();
                    departmentsMap.put(department.getDepartmentId(), department);
                    break;
                case "E":
                    System.out.println("Add Employee");
                    theCompany.addEmployee();
                    break;
                case "S":
                    System.out.println("Show employees of a department");
                    theCompany.showEmployeesOfDepartment();
                    break;
                case "L":
                    System.out.println("Lookup an employee");
                    theCompany.lookupEmployee();
                    break;
                case "B":
                    System.out.println("Show Employees birthdays");
                    theCompany.showBirthdays();
                    break;
                case "VE":
                    System.out.println("Employees");
                    theCompany.showAllEmployees();
                    break;
                case "VD":
                    System.out.println("Departments");
                    theCompany.showAllDepartments();
                    break;
                default:
                    System.err.println("Invalid option, please select again");
            }


        } while (!option.equalsIgnoreCase("x"));


    }
}
