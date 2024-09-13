package University;

public class LabAsistant extends Asistant{

    public LabAsistant(String nameSurname, String phone, String email, String department, String title, String officeHours) {
        super(nameSurname, phone, email, department, title, officeHours);
    }

    public String enterLab(){
        return this.getNameSurname() + " has entered the laboratory";
    }
}
