package University;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Ömer Can Koca" , "05317656544", "omer.c.koca@gmail.com");
        Academician a1 = new Academician("Mustafa Çöl", "0531465656451", "mcol@gmail.com", "COMPENG", "DOÇ");
        Employee e1 = new Employee("Ömer Türkmen", "05321651651", "oturkmen@gmail.com", "Guard", "8");
        Instructor i1 = new Instructor("Feyzullah Koca", "051651616565" , "fkoca@gmail.com" , "Skiing", "Proffesor", "8");
        Asistant asistant1 = new Asistant("Melikşah Koca", "053151688465", "mkoca@gmail.com", "Architecture", "Research Assistant", "8");

        System.out.println(e1.work());
        System.out.println(" - ");
        System.out.println(a1.enterCourse());
        System.out.println(" - ");
        System.out.println(w1.cafeteria());
        System.out.println(" - ");
        System.out.println(i1.enter());
        System.out.println(" - ");
        System.out.println(asistant1.makeQuiz());
        System.out.println(" - ");
        System.out.println(i1.enter("10.00"));

    }
}