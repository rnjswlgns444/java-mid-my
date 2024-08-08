package lang.immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        //기본편 복습
        //기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; //자바는 항상 값을 복사해서 대입한다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
