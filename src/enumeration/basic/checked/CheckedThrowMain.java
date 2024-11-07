package enumeration.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MycheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상종료");

/*Exception in thread "main" enumeration.basic.checked.MycheckedException: ex  //예외 발생 코드
	at enumeration.basic.checked.Client.call(Client.java:7)                    //예외가 발생한 곳 + 경로
	at enumeration.basic.checked.Service.callThrow(Service.java:33)
	at enumeration.basic.checked.CheckedThrowMain.main(CheckedThrowMain.java:7)
*/
    }
}
