
import java.util.Scanner;

public class Appointment {

    private int doctorId;
    private int patientId;
    private String date;
    private String time;
    private String pastdiseases;
    private boolean isAccepted;
    private boolean isRejected;

public Appointment(int doctorId, int patientId, String date, String time, String pastdiseases, boolean isAccepted,
            boolean isRejected) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = date;
        this.time = time;
        this.pastdiseases = pastdiseases;
        this.isAccepted = isAccepted;
        this.isRejected = isRejected;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPastdiseases() {
        return pastdiseases;
    }

    public void setPastdiseases(String pastdiseases) {
        this.pastdiseases = pastdiseases;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public boolean isRejected() {
        return isRejected;
    }

    public void setRejected(boolean isRejected) {
        this.isRejected = isRejected;
    }

    public void bookAnAppointment() {

        Appointment[] docAppointments = App.doctors[this.doctorId].getAppointments();

        for (int i = 0; i < docAppointments.length; i++) {
            if (docAppointments[i] == null) {
                docAppointments[i] = this;
                break;
            }
            System.out.println("Doctor is not available, please try again later!");
            return;
        }

        Appointment[] patAppointments = App.patients[this.patientId].getAppointments();

        for (int i = 0; i < patAppointments.length; i++) {
            if (patAppointments[i] == null) {
                patAppointments[i] = this;
                break;
            }
            System.out.println("you don't hava space! get lost");
            return;
        }
        App.doctors[this.doctorId].setAppointments(docAppointments);
        App.patients[this.patientId].setAppointments(patAppointments);

        System.out.println("****((congratulation your appointment has been booked successfully!))*****");

    }

    static public void acceptAnAppointment()

    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        for (int i = 0; i < App.patients.length; i++) {
        if (App.patients[i].getName().equalsIgnoreCase(patientName)){

          Appointment[] patientAppointments = App.patients[i].getAppointments();
        {
            System.out.println("Appointments for " + patientName + ":");
            for (int j = 0; j < patientAppointments.length; j++) {
                System.out.println(patientAppointments);
            }
             System.out.print("Enter appointment number that you want to Accept: ");
                    int appointmentNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (appointmentNumber >= 1 && appointmentNumber <= patientAppointments.length) {

                        int selectedappointment = appointmentNumber-1;
                        patientAppointments[selectedappointment].setAccepted(true);;

                        System.out.println("appointment is accepted ");
                    }
                    else
                    {
                        System.out.println("appointment is not accepted");
                    }
                    break;
                    
                }
                }
  }
  }
}



    

    
