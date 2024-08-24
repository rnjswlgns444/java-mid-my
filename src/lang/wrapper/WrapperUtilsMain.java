package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); //문자열, 래퍼 객체 반환
        Integer.parseInt("10"); //문자열 전용, 기본형 반환

        /*문자열은 valueOf와 기본형 중에 무엇을 써야 할까?
        * 래퍼 클래스를 반환 받고 싶으면 valueOf
        * 기본형을 반환 받고 싶으면 pareInt*/

        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        //산술연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
