import java.util.Scanner;

public class Doctor extends User {

    private String[] specialization = new String[3];
    private double experience;
    private String designation;
    private Appointment[] appointments = new Appointment[3];

    public Doctor(int id, String name, double age, String gender) {
        super(id, name, age, gender);
        this.specialization = new String[3];
        this.appointments = new Appointment[3];
    }

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
        String[] specialization = { "mbbs", "psychatrist", "sirgen" };
        {
            for (int i = 0; i < specialization.length; i++) {
                if (specialization[i] != null) {
                    System.out.println(specialization[i]);
                }
            }
        }
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
    static public void viewAppointments() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        for (int i = 0; i < App.patients.length; i++) {
            if (App.patients[i].getName().equalsIgnoreCase(patientName)) {

                Appointment[] appointments = App.patients[i].getAppointments();

                {
                    if (appointments.length > 0) {

                        System.out.println("All Appointments:/n");
                        for (int j = 0; j < appointments.length; j++) {
                            System.out.println("docID  -->" + App.appointments[j].getDoctorId());
                            System.out.println("patientid   -->" + App.appointments[j].getPatientId());
                            System.out.println("Date  -->" + App.appointments[j].getDate());
                            System.out.println("Time  -->" + App.appointments[j].getTime());
                            System.out.println("pastdiseases  -->" + App.appointments[j].getPastdiseases());
                        }
                        System.out.println("appointmant has been found");
                        break;
                    }

                    else {
                        System.out.println("No appointments found.");
                    }

                }
            }

            scanner.close();
        }
    }

    public void rejectAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        for (int i = 0; i < App.patients.length; i++) {
            if (App.patients[i].getName().equalsIgnoreCase(patientName)) {

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

                        int selectedappointment = appointmentNumber ;
                        patientAppointments[selectedappointment].setRejected(false);

                        System.out.println("appointment is rejected ");
                    } else {
                        System.out.println("appointment is not rejected");
                    }
                    break;

                }
            
            }
            scanner.close();
        }

    }

    static public void editDoctoritself() {
        {
            Doctor doctors = new Doctor(0, "Noor", 30, "F", new String[3], 4, "surgeon",
                    new Appointment[3]);
            doctors.displaydetail();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            doctors.setName(newName);
            System.out.print("Enter new age: ");
            int newAge = scanner.nextInt();
            doctors.setAge(newAge);
            System.out.print("Enter new gender: ");
            String neweGender = scanner.nextLine();
            doctors.setName(neweGender);
            System.out.print("Enter new experience: ");
            double newExperience = scanner.nextInt();
            doctors.setExperience(newExperience);
            scanner.nextLine();
            System.out.print("Enter new designation: ");
            String newDesignation = scanner.nextLine();
            doctors.setDesignation(newDesignation);
            scanner.nextLine();

            System.out.println("\nUpdated Doctor Information:");

            System.out.println("Name: -->" + doctors.getName());
            System.out.println("Age: -->" + doctors.getAge());
            System.out.println("Gender: -->" + doctors.getGender());
            System.out.println("experience: -->" + doctors.getExperience());
            System.out.println("Designation: -->" + doctors.getDesignation());
            scanner.close();
        }

    }

}
