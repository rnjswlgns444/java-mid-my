package lang.math;

public class MathMain {

    public static void main(String[] args) {
        //기본 연산 멛서드
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
        System.out.println(Math.abs(-10));

        //반올림 및 정밀도 메서드
        System.out.println(Math.ceil(2.1)); //올림
        System.out.println(Math.floor(2.1)); //내림
        System.out.println(Math.round(2.5)); //반올림

        //기타 유용한 메서드
        System.out.println(Math.sqrt(4)); //제곱근
        System.out.println(Math.random()); //0.0 ~ 1.0 사이의 무작위 값

        //cf)아주 정밀한 숫자와 반올림 계산이 필요하다면 BigDecimal을 검색해보자.
    }
}
