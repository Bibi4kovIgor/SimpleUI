package generic;

public class MyMath implements Concat<Integer>{

    static {
        System.out.println("Hello everybody!");
    }

    private Integer v2;

    public MyMath(Integer v2) {
        this.v2 = v2;
    }

    @Override
    public Integer add(Integer v) {
        return v + v2;
    }

    @Override
    public Integer add() {
        return v2;
    }

}
