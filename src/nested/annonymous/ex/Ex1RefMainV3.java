package nested.annonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process p) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        p.run();
        //코드조각 종료

        System.out.println("프로그램 종료");

    }


    public static void main(String[] args) {
        Process dice = new Process() {

            @Override
            public void run() {
                //코드 조각 시작
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);

                //코드 조각 종료

            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                //코드 조각 시작
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }

                //코드조각 종료
            }
        };

        hello(dice);
        hello(sum);

    }
}

