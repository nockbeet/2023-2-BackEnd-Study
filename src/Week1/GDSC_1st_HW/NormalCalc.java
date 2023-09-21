package Week1.GDSC_1st_HW;

public class NormalCalc implements Calculator{

    @Override
    public int plus(int a, int b) {
        return (a + b);
    }

    @Override
    public int minus(int a, int b) {
        return (a - b);
    }

    @Override
    public int mul(int a, int b) {
        return (a * b);
    }

    @Override
    public int div(int a, int b) {
        return (a / b);
    }
}
