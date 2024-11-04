package ThreadRacing;

import java.util.ArrayList;
import java.util.List;

public class RacerBase {
    public static List<Integer> racer1 = new ArrayList<>();
    public static List<Integer> racer2 = new ArrayList<>();
    public static List<Integer> racer3 = new ArrayList<>();
    public static List<Integer> racer4 = new ArrayList<>();
    public static List<Integer> oddNumbers = new ArrayList<>();
    public static List<Integer> evenNumbers = new ArrayList<>();

    List<Integer> numbers = new ArrayList<>();

    public RacerBase() {
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }
        for (int k = 0; k < numbers.size(); k++) {
            if (k < numbers.size() * 1 / 4) {
                racer1.add(k);
            } else if (k < numbers.size() * 1 / 2) {
                racer2.add(k);
            } else if (k < numbers.size() * 3 / 4) {
                racer3.add(k);
            } else {
                racer4.add(k);
            }
        }
    }
}
