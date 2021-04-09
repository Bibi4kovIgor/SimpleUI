package generic;

public abstract class MyCalc implements Concat<Double>{

    @Override
    public Double add(Double v) {
        return  v;
    }

    protected Double sub(Double v2){
        return v2;
    }

    protected abstract Double mul();
}
