package sample;

public class Division implements IAtomicCalc {
    @Override
    public String getResult(String a, String b) {
        return String.valueOf(Double.parseDouble(a) / Double.parseDouble(b));
    }
}
