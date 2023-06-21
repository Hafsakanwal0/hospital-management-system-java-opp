import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("select your user type");
      System.out.println("1: patient");
      System.out.println("2: Doctor");
      System.out.println("3: Admin");
      System.out.println("4: Exit");

      System.out.println("enter your choice (1-3)");
      int choice = scanner.nextInt();
      switch (choice) {

         case 1:

            Patient p1 = new Patient(choice, null, choice, null, null, null);
            p1.bookAnAppointment();

            break;

         case 2:
            System.out.println("you have selected a patient");
            break;

         case 3:

            System.out.println("you have selected a patient");
            break;

         default:
            System.out.println("invalid");
            break;

      }
   }

}
