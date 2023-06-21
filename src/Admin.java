public class Admin extends User {
    private String designation;
    private String department;

    // constractor
    public Admin(int id, String name, double age, String gender, String designation, String department) {
        super(id, name, age, gender);
        this.designation = designation;
        this.department = department;
    }

    // display function
    public void displaydetail() {
        super.displaydetail();
        System.out.println("designation:" + this.designation);
        System.out.println("department:" + this.department);
    }

    // getter//setter
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // methods
    public void addDoctor() {

    }

    public void editDoctor() {

    }

    public void removeDoctor() {

    }

    public void viewDoctor() {

    }
}
