package ThreadRacing;

public class Racer2 extends Racer1{
    private final Object LOCK = new Object();
    @Override
    public void run(){
        synchronized (LOCK){
            for (Integer i : RacerBase.racer2)
                operation(i);
        }
    }
}
