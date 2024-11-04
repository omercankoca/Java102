package ThreadRacing;

public class Racer1 implements Runnable{
    private final Object LOCK =new Object();
    @Override
    public void run() {

        synchronized (LOCK){
            for (Integer i : RacerBase.racer1){

                operation(i);

            }
        }

    }

    public void operation(int x){
        if (x%2 == 0){
            System.out.println(Thread.currentThread().getName() + " : " + x);
            RacerBase.evenNumbers.add(x);
        }else {
            System.out.println(Thread.currentThread().getName() + " : " + x);
            RacerBase.oddNumbers.add(x);
        }
    }


}
