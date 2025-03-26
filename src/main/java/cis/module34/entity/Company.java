package cis.module34.entity;

import java.util.ArrayList;
import java.util.HashMap;

import cis.module34.util.CisUtility;

/**
 * This class will have an attribute to hold all of the staff of a company. A
 * company is made up of employees and departments.
 *
 * @author BJ
 */
public class Company {

    // TODO DONE Issue 1C - Fix syntax issue - use correct base class
    private ArrayList<Employee> employees = new ArrayList<>();

    // ********************************************************************
    // The following HashMap is for the deparements of the business. The
    // departmentId (String) is the key and a Department object is the value
    // of the HashMap.
    // ********************************************************************
    private HashMap<String, Department> departments = new HashMap();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public HashMap<String, Department> getDepartments() {
        return departments;
    }

    public void setDepartments(HashMap<String, Department> departments) {
        this.departments = departments;
    }

    /**
     * Show all employees
     * 
     * @since 20230338
     * @author BJM
     */
    public void showAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("");
            employee.display();
        }
        System.out.println("");
    }

    /**
     * Show all departments
     * 
     * @since 20230338
     * @author BJM
     */
    public void showAllDepartments() {
        for (Department current : departments.values()) {
            System.out.println(current.toString());
        }
    }

    public void addEmployee() {
        Employee employee = null;

        String employeeType = CisUtility.getInputString(
                "Enter employee type (1 for Employee, 2 for Manager, 3 for Instructor, 4 for Administrator):");

        switch (employeeType) {
            case "1":
                employee = new Employee();
                break;
            case "2":
                employee = new Manager();
                break;
            case "3":
                employee = new Instructor();
                break;
            case "4":
                employee = new Administrator();
                break;
            default:
                employee = new Employee();
                break;
        }

        employees.add(employee);
    }

    public void showBirthdays() {
        String month = CisUtility.getInputString("Enter birth month:");

        for (Employee employee : employees) {
            if (month.equals(employee.getDob().substring(5, 7))) {
                System.err.println(employee);
            }
        }
    }

    public void showEmployeesOfDepartment() {
        String deptToFind = CisUtility.getInputString("Enter department name to find:");
 
        final int NOT_FOUND = -1;
        int id = NOT_FOUND;
        for (Department current : departments.values()) {
            if (current.getName().equalsIgnoreCase(deptToFind)) {
                id = current.getDepartmentId();
                break;
            }
        }

        if (id > NOT_FOUND) {
            for (Employee e : employees) {
                if (e.getDepartmentId() == id) {
                    System.out.println(e);
                    e.showContactInformation();
                }
            }
        }
    }

    public void lookupEmployee() {
        String name = CisUtility.getInputString("Enter employee name to find:");
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println(e);
            }
        }
    }

}
