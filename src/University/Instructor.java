package University;

public class Instructor extends Academician {
    private String doorNumber;

    public Instructor(String nameSurname, String phone, String email, String department, String title, String doorNumber) {
        super(nameSurname, phone, email, department, title);
        this.doorNumber = doorNumber;
    }
    public String getDoorNumber(){
        return this.doorNumber;
    }
    public void setDoorNumber(String doorNumber){
        this.doorNumber =doorNumber;
    }
    public String meeting(){
        return this.getNameSurname() + " has joined the meeting";
    }
    public String makeExam(){
        return this.getNameSurname() + " make exam from " + this.getDepartment() + " course!!";
    }
}
