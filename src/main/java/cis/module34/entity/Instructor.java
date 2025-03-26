package cis.module34.entity;

public class Instructor extends Employee {

    public Instructor() {
    }

    public Instructor(String name, String dob, double salary, String phoneNumber, String emailAddress,
            int departmentId) {
        super(name, dob, salary, phoneNumber, emailAddress, departmentId);
        setTitleInstructor();
    }

    private void setTitleInstructor() {
        // TODO Auto-generated method stub
        this.title = "Instructor";
    }
}
