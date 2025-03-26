package cis.module34.entity;


import cis.module34.util.CisUtility;

/**
 * This class contains information about a company's departments.  
 * 
 * @author BJ
 * @since 20140310
 */
public class Department {
    private int departmentId;
    private String name;
    private Double budget;
    private int managerId;  //employeeId of manager

    public Department(int departmentId, String name, Double budget, int managerId) {
        this.departmentId = departmentId;
        this.name = name;
        this.budget = budget;
        this.managerId = managerId;
    }

    public Department(){
        //default constructor
    }
    
    public void getInformation(){
        this.departmentId = CisUtility.getInputInt("DepartmentId");
        this.name = CisUtility.getInputString("Department name:");
        this.budget = CisUtility.getInputDouble("Budget:");
        this.managerId = CisUtility.getInputInt("Manager id?");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }


    
    
}
