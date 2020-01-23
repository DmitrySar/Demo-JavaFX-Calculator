package sample;

public class Parse {

    private final long INIT_VALUE = 0;
    private long[] mem = {INIT_VALUE, INIT_VALUE};
    private String operation = "";
    private int index = 0;

    public void addNumber(String num) {
        mem[index] = Long.parseLong(num);
        index = 1 - index;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getA() {
        return mem[0];
    }

    public long getB() {
        return mem[1];
    }

    public String getOperation() {
        return operation;
    }

}
