package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간: " + nowTime);

        LocalTime ofTime = LocalTime.of(9,10, 30);
        // "Ctrl + p"를 통해서 파라미터 안에 들어가야 할 값들을 알 수 있다.
        System.out.println("지정 시간: " + ofTime);

        //계산(불변)
        ofTime = ofTime.plusSeconds(30);
        System.out.println("지정 시간 + 30 : " + ofTime);

    }
}
