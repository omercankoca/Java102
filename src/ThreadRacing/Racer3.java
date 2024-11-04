package ThreadRacing;

public class Racer3 extends Racer2{
    private final Object LOCK = new Object();
    @Override
    public void run(){
        synchronized (LOCK){
            for (Integer i : RacerBase.racer3){
                operation(i);
            }
        }
    }
}
