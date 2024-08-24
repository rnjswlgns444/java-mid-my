package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다. - 운영체제가 사용하는 것.
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다. - 자바가 사용하는 것.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        //System.arraycopy(원본(복사할 곳), 원본인덱스 어디부터?, 복사본(붙여넣기 할 곳), 복사본 어디부터 붙여넣기 할 것?, 원본 어디까지 복사?)
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //프로그램 종료 - 가급적이면 사용하지 말것!!!!!!!!!!!!
        //의도하지 않은 종료가 생기는 경우가 생김.
        System.exit(0);
        //상태코드 0 : 정상 종료
        //상태코드 0이 아님: 오류나 예외적인 종료



    }
}
