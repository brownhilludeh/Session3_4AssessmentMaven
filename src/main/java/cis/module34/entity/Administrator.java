package cis.module34.entity;

public class Administrator extends Employee {

    public Administrator() {
        setTitleAdministrator();
    }

    public Administrator(String name, String dob, double salary, String phoneNumber, String emailAddress,
            int departmentId) {
        super(name, dob, salary, phoneNumber, emailAddress, departmentId);
        setTitleAdministrator();
    }

    private void setTitleAdministrator() {

        title = "Administrator";
    }
}
