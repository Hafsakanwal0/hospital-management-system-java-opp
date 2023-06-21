public class Doctor extends User {

    private String[] specialization = new String[3];
    private double experience;
    private String designation;
    private Appointment[] appointments = new Appointment[3];

    // constractors
    public Doctor(int id, String name, double age, String gender, String[] specialization, double experience,
            String designation, Appointment[] appointments) {
        super(id, name, age, gender);
        this.specialization = specialization;
        this.experience = experience;
        this.designation = designation;
        this.appointments = appointments;
    }

    public void displaydetail() {
        super.displaydetail();
        System.out.println("specialization:" + this.specialization);
        specialization[0] = "";
        specialization[1] = "";
        specialization[2] = "";
        System.out.println("experience:" + this.experience);
        System.out.println("designation:" + this.designation);
    }

    // getter //setters
    public String[] getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String[] specialization) {
        this.specialization = specialization;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }

    // methods
    public void doctorSeeAppointments() {

    }

    public boolean acceptAppointment() {
        return true;
    }

    public boolean rejectAppointment() {
        return false;
    }
}
