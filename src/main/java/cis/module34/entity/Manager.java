package cis.module34.entity;

/**
 *
 * @author bjmaclean
 */

//TODO DONE Issue 1B - Fix syntax issue - extends
public class Manager extends Employee{
   
    private String title = "Manager"; 
    
    public Manager() {
        setTitleManager();
    }

    public Manager(String name, String dob, double salary, String phoneNumber, String emailAddress, int departmentId) {
        super(name, dob, salary, phoneNumber, emailAddress, departmentId);
        setTitleManager();
    }

    public Manager(String firstName, String lastName, String dob, double salary, String phoneNumber, String emailAddress, int departmentId) {
        super(firstName, lastName, dob, salary, phoneNumber, emailAddress, departmentId);
        setTitleManager();
    }
    
   public final void setTitleManager(){
       this.title = "Manager";
   }
    
}
