package sample;

public class Calculator {

    long a;
    long b;
    String o;

    public Calculator(long a, long b, String o) {
        this.a = a;
        this.b = b;
        this.o = o;
    }

    public long getResult() {
        switch (o) {
            case "/": return a / b;
            case "*": return a * b;
            case "+": return a + b;
            case "-": return a - b;
            default: return 0;
        }
    }
}
