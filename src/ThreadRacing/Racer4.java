package ThreadRacing;

public class Racer4 extends Racer3{
    private final Object LOCK = new Object();

    @Override
    public void run(){
        synchronized (LOCK){
            for (Integer i : RacerBase.racer4){
                operation(i);
            }
        }
    }
}
