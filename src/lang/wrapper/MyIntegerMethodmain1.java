package lang.wrapper;

public class MyIntegerMethodmain1 {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.CompareTo(5);
        int i2 = myInteger.CompareTo(10);
        int i3 = myInteger.CompareTo(15);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
