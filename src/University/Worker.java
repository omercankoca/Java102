package University;

public class Worker {
    private String nameSurname;
    private String phone;
    private String email;

    public Worker(String nameSurname, String phone, String email) {
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String enter(String enteringHour){
        return this.getNameSurname() + enteringHour + "has enetered!!";
    }

    public String enter() {
        return this.getNameSurname() + " has entered!!";
    }

    public String exit() {
        return this.getNameSurname() + " has exited";
    }

    public String cafeteria() {
        return this.getNameSurname() + " has eated meal.!!";
    }


}

