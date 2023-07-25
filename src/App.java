import java.util.Scanner;

public class App {

   // datasource
   static Patient[] patients = new Patient[3];
   static Doctor[] doctors = new Doctor[3];
   static Admin[] admin = new Admin[3];
   static Appointment[] appointments = new Appointment[3];

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

     Patient firstPatient = new Patient(0, "Hafsa", 22, "F", "10-02-2003", "single", new String[3],
           new Appointment[3]);
     patients[0] = firstPatient;
     Patient secondPatient = new Patient(2, "Kanwal", 32, "F", "10-02-2007", "single", new String[3],
           new Appointment[3]);
     patients[1] = secondPatient;

      Doctor firstdoctor = new Doctor(0, "Hamza", 30, "F", new String[3], 4, "surgeon", new Appointment[3]);
      doctors[0] = firstdoctor;
        Doctor seconddoctor = new Doctor(1, "Huzaifa", 40, "F", new String[3], 5, "dentist", new Appointment[3]);
      doctors[1] = seconddoctor;

      
      Admin firstAdmin=new Admin(0, "Habib", 35, "M", "money manager", "counter");
      admin[0]= firstAdmin;
      Admin secondAdmin=new Admin(12, "Haseeb", 35, "M", "files manager", "counter");
      admin[1]= secondAdmin;

      Appointment firsAppointment=new Appointment(0, 0, "02-12-2023", "12:00pm", "NO", false, false);
      appointments[0]=firsAppointment;
      Appointment secondAppointment=new Appointment(1, 2, "01-11-2023", "11:30am", "covid", false, false);
      appointments[1]=secondAppointment;
      

      int choice = -1;
   
      while (choice != 4) {
         System.out.println("select your user type");
         System.out.println("1: Patient");
         System.out.println("2: Doctor");
         System.out.println("3: Admin");
         System.out.println("4: Exit");

         System.out.println("enter your choice (1-4)");
         choice = scanner.nextInt();
         switch (choice) {

            // patient menue
            case 1: {

               int patientChoice = -1;

               while (patientChoice != 5) {
                  System.out.println("1:Book An Appointments");
                  System.out.println("2:Search An Appointments");
                  System.out.println("3:Delete an appointments");
                  System.out.println("4:Edit Information");
                  System.out.println("5:Go Back");
                  System.out.println("enter your choice (1-5)");
                  patientChoice = scanner.nextInt();
                  switch (patientChoice)

                  {
                     case 1: {
                        System.out.print("Enter the doctor's name:");
                        String doctorName = scanner.next();
                        scanner.nextLine();
                        System.out.print("Enter the desired date (YYYY-MM-DD):");
                        String date = scanner.next();
                        System.out.print("Enter the desired time (HH:MM AM/PM):");
                        String time = scanner.next();
                        System.out.print("Enter any past diseases (if any): ");
                        String pastdiseases = scanner.next();

                        int docId = -1;
                        int patId = -1;
                        String patientName = "Hafsa";
                        for (int i = 0; i < doctors.length; i++) {
                           if (doctors[i].getName().equalsIgnoreCase(doctorName)) {
                              docId = doctors[i].getId();
                              break;
                           }

                        }

                        for (int i = 0; i < patients.length; i++) {
                           if (patients[i].getName().equalsIgnoreCase(patientName)) {
                              patId = patients[i].getId();
                              break;
                           }
                        }

                        Appointment appointment = new Appointment(docId, patId, date, time, pastdiseases, false, false);
                        appointment.bookAnAppointment();
                        break;
                     }
                     case 2: {
                        Patient.searchAnAppoinment();
                        break;
                     }
                     case 3: {
                        Patient.removeAppointments();
                        break;

                     }
                     case 4: {
                       User.editUser();
                        break;
                     }
                     case 5: {
                        break;
                     }

                  }
               }
               break;
            }

            // doctor menu
            case 2: {

               int doctorchoice = -1;
               while (doctorchoice != 5) {
                  System.out.println("1:See all Appointments");
                  System.out.println("2:Accept An Appointments");
                  System.out.println("3:Reject An Appointments");
                  System.out.println("4:Edit Doctor");
                  System.out.println("5:Go back");
                  System.out.println("enter your choice (1-5)");
                  doctorchoice = scanner.nextInt();
                  switch (doctorchoice) {

                     case 1: {
                        Doctor.viewAppointments();
                        break;
                     }
                     case 2: {
                        Appointment.acceptAnAppointment();
                      break;
                     } 
                     case 3: {
                        
                        break;
                     }
                     case 4: {
                        Doctor.editDoctoritself();
                        break;
                     }
                     case 5: {
                        break;
                     }
                  }
               }
               break;
            }
            // admin menu
            case 3: {

               int adminchoice = -1;

               // user menu
               while (adminchoice != 5) {

                  System.out.println("1:Add Doctor");
                  System.out.println("2:Edit Doctor");
                  System.out.println("3:Remove Doctor");
                  System.out.println("4:See All Doctors");
                  System.out.println("5:Go back");
                  System.out.println("enter your choice (1-5)");
                  adminchoice = scanner.nextInt();
                  switch (adminchoice) {
                     case 1:

                     {
                     System.out.println("you can add doctor successfully after giving this info");
                       Admin.addDoctor();
                        break;
                     }

                     case 2: {
                        {
                          Admin.editDoctor();
                           break;
                        }
                     }
                     case 3: {
                        Admin.removeDoctor();
                        break;
                     }
                     case 4: {
                        Admin.viewAllDoctor();
                        break;
                     }
                     case 5: {
                        break;
                     }
                  }
               }
               break;
            }
         }

      }

      scanner.close();

   }
}