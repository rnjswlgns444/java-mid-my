package nested.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); //"outer라는 인스턴스 안에 "Inner"를 만들 것이라는 뜻으로 보면 됨

        inner.print();
        System.out.println("innerClass = " + inner.getClass());


    }
}
