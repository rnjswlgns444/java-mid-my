package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        //NestedOuter outer = new NestedOuter(); - 굳이 이 인스턴스가 없어도 밑에 코드를 따로 생성 가능.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
