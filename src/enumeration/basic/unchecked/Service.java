package enumeration.basic.unchecked;

/*
 * UnChecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.(예외가 생기지 않는 것이 아님)
 * */
public class Service {

    Client client = new Client();

    /*
    * 필요한 경우 예외를 잡아서 처리하면 된다.
    * */

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            //예외처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());

        }

        System.out.println("정상 로직");

    }

    /*
    * 예외를 잡지 않아도 된다.
    * 잡지 않으면 자연스럽게 상위로 넘어간다.(체크 예외와 차이점)
    * 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
    * */

    public void callThrow() {
        client.call();
    }
}
