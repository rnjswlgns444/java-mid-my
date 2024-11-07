package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1,2,0, 0, 0);
        System.out.println("기준 시각: " + dt);

        LocalDateTime dt2 = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);  //메서드 체이닝 사용.
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + dt2);

    }
}
