import java.util.Scanner;

public class User {
    private int id;
    private String name;
    private double age;
    private String gender;

    public User(int id, String name, double age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getDoctorId(int id) {
        return id;
    }

    public int getPersonId(int id) {
        return id;
    }

    // getter //setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displaydetail() {
        System.out.println("ID:" + this.id);
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Gender:" + this.gender);

    }
    
static public void editUser(){
        User user = new User(1, "Misbah", 20, "F");
                        user.displaydetail();

                      Scanner scanner = new Scanner(System.in);

                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        user.setName(newName);
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        user.setAge(newAge);
                        scanner.nextLine();

    
                        System.out.println("\nUpdated User Information:");
                        System.out.println("ID: " + user.getId());
                        System.out.println("Name: " + user.getName());
                        System.out.println("Age: " + user.getAge());
                        System.out.println("Gender: " + user.getGender());

                        scanner.close();
    }
   
}