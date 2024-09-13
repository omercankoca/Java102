package University;

public class Employee extends Worker {
    private String field;
    private String shift;

    public Employee(String nameSurname, String phone, String email, String field, String shift) {
        super(nameSurname, phone, email);
        this.field = field;
        this.shift = shift;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String work() {
        return this.getNameSurname() + " worked " + this.shift + " hours!!";
    }
}
