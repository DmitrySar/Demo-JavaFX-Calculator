package sample;

import java.util.ArrayList;

public class Calculators {

    private ArrayList<Calculator> calcs = new ArrayList<>();

    public void put(Calculator calc) {
        calcs.add(calc);
    }

    public Calculator get() {
        Calculator calc = calcs.get(calcs.size() - 1);
        calcs.remove(calcs.size() - 1);
        return calc;
    }
}
