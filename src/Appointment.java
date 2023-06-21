public class Appointment 
 {

    private String doctorname;
   private  String date;
    private String time;
    private String pastDiseases;


   

        public Appointment(String doctorname, String date, String time, String pastDiseases) {
        this.doctorname = doctorname;
        this.date = date;
        this.time = time;
        this.pastDiseases = pastDiseases;
    }




        public String getDoctorName() {
        return doctorname;
    }




    public void setDoctorName(String doctorname) {
        this.doctorname = doctorname;
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




    public String getPastDiseases() {
        return pastDiseases;
    }




    public void setPastDiseases(String pastDiseases) {
        this.pastDiseases = pastDiseases;
    }




        public void display(){
            System.out.println("Doctor: " + this.getDoctorName());
            System.out.println("Date: " + this.getDate());
            System.out.println("Time: " + this.getTime());
            System.out.println("Past Diseases: " + this.getPastDiseases());
            System.out.println();
        }
        
    }

   
/*@Override
public int getDoctorId(int id){
    return id;
}
@Override
public int getPersonId(int id)
{
return id;
}*/
// Display the appointments
       

 


 