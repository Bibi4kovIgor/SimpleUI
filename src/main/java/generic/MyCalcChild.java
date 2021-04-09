package generic;

public class MyCalcChild extends MyCalc{
    @Override
    public Double add() {
        return 0.5;
    }

    @Override
    public Double sub(Double v2) {
        return super.sub(v2);
    }

    @Override
    protected Double mul() {
        return 3.3;
    }
}
