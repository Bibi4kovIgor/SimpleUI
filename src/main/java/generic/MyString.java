package generic;

public class MyString implements Concat<String> {

    private String v1;

    public MyString(String t) {
        this.v1 = t;
    }

    public MyString(){
        this.v1="123";
    }

    @Override
    public String add(String v) {
        return v1+v;

    }

    @Override
    public String add() {
        return v1;
    }

    public static String print(String str){
        return str;
    }

}
