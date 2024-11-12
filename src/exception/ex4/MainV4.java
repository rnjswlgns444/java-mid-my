package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
//        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메세지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("개발자용 디버깅 메세지: ==");
        e.printStackTrace(System.out); //스택 트레이스 출력
        //e.printStackTrace(); - 일반적으로 이거 사용하면 됨. 근데 약간 순서가 꼬여서 보기 어려울 수도 있어서 위 코드로 작성한 것.
        //로그 라이브러리 - 예외처리2 실습 p.35 참고.

        //필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전thd 오류] 전송 데이터" + sendEx.getSendData());
        }
    }
}
