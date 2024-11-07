package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("현재 날짜: " + nowDate);

        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("지정 날짜: " + ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10); //날짜 데이터는 불변이기 때문에 변수 지정이 반드시 필요함!
        System.out.println("지정 날짜 + 10d: " + ofDate);

    }
}
