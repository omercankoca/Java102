package University;

public class Asistant extends Academician {

    private String officeHours;
    public Asistant(String nameSurname, String phone, String email, String department, String title, String officeHours) {
        super(nameSurname, phone, email, department, title);
        this.officeHours = officeHours;
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }
    public String makeQuiz(){
        return this.getNameSurname() + " make quiz from " + this.getDepartment() + " course!!";
    }
}
