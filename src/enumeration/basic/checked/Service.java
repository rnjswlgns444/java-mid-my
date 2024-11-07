package enumeration.basic.checked;

/*
* Checked 예외는
* 예회를 잡아서 처리하거나,
* 던지거나 둘 중 하나를 필수로 선택해야 한다.
* */
public class Service {
    Client client = new Client();

    /*
     * 예외를 잡아서 처리하는 코드
     * */
    public void callCatch() {
        try {
            client.call();
        } catch (MycheckedException e) { //catch(Exception e) 라고 해도 MycheckedExcetpion이 Exception의 자식이기 때문에 잡을 수 있다.
                                         // 즉 chatch에 예외를 지정하면 해당 예외와 그 하위 타입 예외를 모두 잡아준다.

            //예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    /*
    * 체크 예외를 밖으로 던지는 코드
    * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
    * */

    public void callThrow() throws MycheckedException {
        client.call();
    }

}
