import java.util.Scanner;

public class Patient extends User {

    private String dateofbirth;
    private String martialStatus;
    private String[] pastdiseases = new String[3];
    private Appointment[] appointments = new Appointment[3];

    public String[] getPastdiseases() {
        return pastdiseases;
    }

    public void setPastdiseases(String[] pastdiseases) {
        this.pastdiseases = pastdiseases;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }

    public Patient(int id, String name, double age, String gender) {
        super(id, name, age, gender);
        this.appointments = new Appointment[3];
        this.pastdiseases = new String[3];
    }

    // constractor
    public Patient(int id, String name, double age, String gender, String dateofbirth, String martialStatus,
            String[] pastdiseases, Appointment[] appointments) {
        super(id, name, age, gender);
        this.dateofbirth = dateofbirth;
        this.martialStatus = martialStatus;
        this.pastdiseases = pastdiseases;
        this.appointments = appointments;
    }

    public void displaydetail() {
        super.displaydetail();
        System.out.println("dateofbirth:" + this.dateofbirth);
        System.out.println("martialstatus:" + this.martialStatus);
        String[] pastdiseases = { "covid", "dengi", "tb" };
        {
            for (int i = 0; i < pastdiseases.length; i++) {
                if (pastdiseases[i] != null) {
                    System.out.println(this.pastdiseases[i]);
                }
            }
        }
    }

    // getter //setters
    public String getDateofbirth() {
        return this.dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getMartialStatus() {
        return this.martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    // methods
    static public void searchAnAppoinment() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        for (int i = 0; i < App.patients.length; i++) {
            if (App.patients[i].getName().equalsIgnoreCase(patientName))

            {
                Appointment[] patientAppointments = App.patients[i].getAppointments();
                if (patientAppointments.length > 0) {

                    //boolean found = true;
                    System.out.println("Appointments for patient '" + patientName + "':");
                    for (int j = 0; j < patientAppointments.length; j++) {
                        System.out.println(patientAppointments);
                        System.out.println("appointment has been found");
                        break;
                    }
                  }
                 else {
                    System.out.println("No appointments found for the given patient.");
                   return;
                }
                scanner.close();;
            }
          
        }
    }

 
    

    static public void removeAppointments() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        for (int i = 0; i < App.patients.length; i++) {
            if (App.patients[i].getName().equalsIgnoreCase(patientName)) {
                Appointment[] patientAppointments = App.patients[i].getAppointments();
                if (App.appointments.length>0) {
                    {
                    System.out.println("Appointments for " + patientName + ":");
                    for (int j = 0; j < patientAppointments.length; j++) {
                        System.out.println(patientAppointments);
                    }
                    System.out.print("Enter appointment number to delete: ");
                    int appointmentNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (appointmentNumber >= 1 && appointmentNumber <= patientAppointments.length) {

                        int selectedNumber = appointmentNumber;

                        patientAppointments[selectedNumber] = null;

                        System.out.println("Appointment deleted successfully.");
                    } else {
                        System.out.println("Invalid appointmentNumber.");
                    }
                    scanner.close();;
                }
            }
        }
    }
}
}

         
    


