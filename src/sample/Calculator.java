package sample;

public class Calculator implements ICalculator {

    private IAtomicCalc calc;
    private String a;
    private String b;

    public Calculator(IAtomicCalc calc) {
        this.calc = calc;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String getResult() {
        return calc.getResult(a, b);
    }

}
