package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("현재 날짜시간: " + nowDt);

        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("지정 날짜시간: " + ofDt);

        //날짜 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("LocalDate = " + localDate);
        System.out.println("LocalTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime: " + localDateTime);

        //계산(불변)
        LocalDateTime ofPlus = localDateTime.plusDays(1000);
        System.out.println("지정 날짜시간 + 1000d: " + ofPlus);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가?" + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가?" + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 같은가?" + nowDt.isEqual(ofDt));
    }
}
