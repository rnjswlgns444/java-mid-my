package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect()  { //반환값을 던질 필요가 없으니까 void로 설정.

        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data)  {

        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 더이터 전송 실패");
//            throw new RuntimeException("ex");  //RumtimeException (알 수 없는 오류 부르기 위해 작성)
        }

        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");

    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }

}
