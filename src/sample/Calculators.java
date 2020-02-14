package sample;

import java.util.ArrayList;

public class Calculators {

    private ArrayList<ICalculator> calcs = new ArrayList<>();

    public void put(ICalculator calc) {
        calcs.add(calc);
    }

    public ICalculator get() {
        ICalculator calc = calcs.get(calcs.size() - 1);
        calcs.remove(calcs.size() - 1);
        return calc;
    }
}
