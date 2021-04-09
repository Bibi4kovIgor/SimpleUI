package generic;

public class Main {


    public static void main(String[] args) {
        MyMath myMath = new MyMath(23);
        MyString myString2 = new MyString();
        MyString myString = new MyString("23");
        System.out.println(myMath.add(25));
        System.out.println(myString.add(" 25"));
        System.out.println(myString2.add());
        System.out.println(MyString.print("Some text"));
        MyCalcChild child = new MyCalcChild();
        System.out.println(child.add(2.2));
        System.out.println(child.add());
        System.out.println(child.sub(1.1));
        System.out.println(child.mul());

    }
}
