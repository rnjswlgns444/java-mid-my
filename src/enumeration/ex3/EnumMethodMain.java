package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name = " + value.name() + "ordinal = " + value.ordinal());
        //ordinal 메서드는 문제를 많이 일으키는 메서드이므로 가급적 사용하지 말 것.
            //어떤 문제인지 자세히 보려면 "열거형" p.18 확인하기.
        }

        //String -> enum 변환, valueOf 안에 잘못된 문자가 오면 IllegalArgumentException 발생
        String input ="GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); //toString 오버라이딩 가능.
    }
}
