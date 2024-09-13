package University;

public class InformationTechnology extends Employee{

    private String duty;

    public InformationTechnology(String nameSurname, String phone, String email, String field, String shift, String duty) {
        super(nameSurname, phone, email, field, shift);
        this.duty = duty;
    }
    public String getDuty(){
        return this.duty;
    }
    public void setDuty(String duty){
        this.duty = duty;
    }
    public String setNetwork(){
        return  this.getNameSurname() + " has set the Network";
    }

}
