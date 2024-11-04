package ThreadRacing;

import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        new RacerBase();
        Racer1 racer1 =new Racer1();
        Racer2 racer2 = new Racer2();
        Racer3 racer3 = new Racer3();
        Racer4 racer4 = new Racer4();
        System.out.println("first look for even array " + RacerBase.evenNumbers);
        System.out.println("First look for odd array" + RacerBase.oddNumbers);
        ExecutorService racerPool = Executors.newFixedThreadPool(16);
        for (int i = 0 ; i<16; i++){
            racerPool.execute(racer1);
            racerPool.execute(racer2);
            racerPool.execute(racer3);
            racerPool.execute(racer4);
        }
        racerPool.close();

        Collections.sort(RacerBase.oddNumbers);
        Collections.sort(RacerBase.evenNumbers);
        System.out.println("First status for even array " + RacerBase.evenNumbers);
        System.out.println("----------------------------------------------------");
        System.out.println("First status for odd array " + RacerBase.oddNumbers);
        System.out.println("----------------------------------------------------");
    }
}
