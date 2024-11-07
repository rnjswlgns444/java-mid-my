package nested.nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1; // 지역변수 앞에는 private, public 같은 접근 제어자를 사용할 수 없다.

        class LocalPrinter implements Printer { // 인터페이스, 상속 가능!
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("LocalVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);

    }
}
