package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer { // 인터페이스, 상속 가능!
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("LocalVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
//        localPrinter.print(); ->실행하지 않고 Printer 인스턴스만 반환한다.
        return localPrinter;

    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2); 
        printer.print(); //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행.

        //추가ㅣ
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
