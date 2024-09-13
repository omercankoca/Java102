package University;

public class SecurityGuard extends Employee {

    private String document;

    public SecurityGuard(String nameSurname, String phone, String email, String field, String shift, String document) {
        super(nameSurname, phone, email, field, shift);
        this.document = document;
    }

    public String getDocument(){
        return this.document;
    }
    public void setDocument(String document){
        this.document = document;
    }
    public String watch(){
        return this.getNameSurname() + "kept watch.!!";
    }

}
