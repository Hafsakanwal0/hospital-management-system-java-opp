import java.util.Scanner;

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
    static public void addDoctor() {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter doctor id:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter doctor name:");
            String name = scanner.nextLine();

            System.out.println("Enter doctor age:");
            int age = scanner.nextInt();

            System.out.println("Enter doctor gender:");
            String gender = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Enter doctor specialization:");
            String specialization = scanner.nextLine();

            System.out.println("Enter doctor experience:");
            double experience = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter doctor designation:");
            String designation = scanner.nextLine();

            System.out.println("Enter doctor appointments:");
            String appointments = scanner.nextLine();

            Doctor doctor = new Doctor(id, name, age, gender, null, experience, designation, null);
            doctor.setId(id);
            doctor.setName(name);
            doctor.setAge(age);
            doctor.setGender(gender);
            doctor.setExperience(experience);
            doctor.setDesignation(designation);

            System.out.println("##<<<congratulation new doctor info were added successfully>>>>##");
            System.out.println("Doctor  Id is  -->" + id);
            System.out.println("Doctor name is  -->" + name);
            System.out.println("Doctor age is  -->" + age);
            System.out.println("Doctor Gender -->" + gender);
            System.out.println("Doctor specilization  -->" + specialization);
            System.out.println("Doctor experience is  -->" + experience);
            System.out.println("Doctor ddesignation is  -->" + designation);
            System.out.println("Doctor appointments  --> " + appointments);
            scanner.close();
        }

    }

    static public void editDoctor() {
        {
            Doctor doctors = new Doctor(0, "Noor", 30, "F", new String[3], 4, "surgeon",
                    new Appointment[3]);
            doctors.displaydetail();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter new name:--> ");
            String newName = scanner.nextLine();
            doctors.setName(newName);
            System.out.print("Enter new age:--> ");
            int newAge = scanner.nextInt();
            doctors.setAge(newAge);
             scanner.nextLine();
           System.out.print("Enter new gender:--> ");
            String neweGender = scanner.nextLine();
            doctors.setGender(neweGender);
            System.out.print("Enter new experience:--> ");
            double newExperience = scanner.nextInt();
            doctors.setExperience(newExperience);
            System.out.print("Enter new designation:--> ");
            String newDesignation = scanner.nextLine();
            doctors.setDesignation(newDesignation);

            System.out.println("\nUpdated Doctor Information:");

            System.out.println("Name:>>> " + doctors.getName());
            System.out.println("Age:>>> " + doctors.getAge());
            System.out.println("Gender:>>> " + doctors.getGender());
            System.out.println("experience:>>> " + doctors.getExperience());
            System.out.println("Designation:>>> " + doctors.getDesignation());
            scanner.close();
        }

    }

    static public void removeDoctor() {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the ID of the doctor to delete: ");
    int doctorId = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < App.doctors.length; i++) {
        if (App.doctors[i].getId()==(doctorId))
        {
        int deletedoctor=doctorId;
        App.doctors[deletedoctor]=null;
        System.out.println("Doctor was deleted successfully");

     }
    }
    scanner.close();
}

   static public void viewAllDoctor() {
        

        for(int i=0;i<App.doctors.length;i++) 
        {
            if (App.doctors.length>0) {
                // Print the details of each doctor
                System.out.println("Doctor ID:==:>>> " + App.doctors[i].getId());
                System.out.println("Name:==:>>> " + App.doctors[i].getName());
                System.out.println("Age:==:>>> " + App.doctors[i].getAge());
                System.out.println("Gender:==:>>> " + App.doctors[i].getGender());
                System.out.println("Specialization:==:>>> " + App.doctors[i].getSpecialization());
                System.out.println("Eperience:==:>>> " + App.doctors[i].getExperience());
                System.out.println("Designation:==:>> " + App.doctors[i].getDesignation());
                System.out.println("Appointments:==:>> " + App.doctors[i].getAppointments());
                
                 System.out.println("see  doctor info successfully"); 
            }

            

    }

}
}
