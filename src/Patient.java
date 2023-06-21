import java.util.Scanner;

public class Patient extends User {

    private String dateofbirth;
    private String martialStatus;
    private String[] pastdiseases = new String[3];
    private Appointment[] appointments = new Appointment[3];
    Scanner scanner = new Scanner(System.in);

    public void bookAnAppointment() {
        System.out.println("Appointment Booking");

        // Prompt for doctor's name
        System.out.print("Enter doctor's name: ");
        String doctorName = scanner.nextLine();

        // Prompt for date
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        // Prompt for time
        System.out.print("Enter time (HH:MM): ");
        String time = scanner.nextLine();

        System.out.println("enter the pastdiseases");
        String pastDiseases = scanner.nextLine();
        Appointment appointment = new Appointment(doctorName, date, time, pastDiseases);
    }

    public void patientSeeAppointments() {

    }

    // contractors
    public Patient(int id, String name, double age, String gender, String dateofbirth,
            String martialStatus) {
        super(id, name, age, gender);
        this.dateofbirth = dateofbirth;
        this.martialStatus = martialStatus;

    }
    /*
     * public int getPatientId(int id){
     * return id;
     */

    // getter //setters
    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

}
