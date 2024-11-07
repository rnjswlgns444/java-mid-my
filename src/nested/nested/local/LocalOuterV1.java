package nested.nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1; // 지역변수 앞에는 private, public 같은 접근 제어자를 사용할 수 없다.

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("LocalVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);

    }
}
