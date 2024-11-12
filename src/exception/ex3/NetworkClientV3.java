package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 { //반환값을 던질 필요가 없으니까 void로 설정.

        if (connectError) {
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {

        if (sendError) {
            throw new SendExceptionV3(data, address + " 서버에 더이터 전송 실패");
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
