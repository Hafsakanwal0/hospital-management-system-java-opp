 public class User{
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
       public int getDoctorId(int id)
       {
        return id;
       }
       public int getPersonId(int id){
        return id;
       }
    //getter //setters
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
   public void displaydetail()
    {
    System.out.println("ID:" +this .id);
    System.out.println("Name:" +this .name);
    System.out.println("Age:" +this .age);
    System.out.println("Gender:" +this .gender);

}
  }