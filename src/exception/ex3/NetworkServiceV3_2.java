package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try { //정상흐름
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + " , 메세지: " + e.getMessage());

        } catch (NetworkClientExceptionV3 e) { // 위 catch(ConnectExceptionV3)와 순서가 바뀌면 오류 발생.
                                               // 왜? ConnectExceptionV3는 NetworkClientExceptionV3의 자식이기 때문에
                                               // NetworkClientExceptionV3가 먼저 오면 ConnectExceptionV3는
                                               // 영원히 호출되지 않기 때문 => catch는 순서대로 실행하기 때문에
                                               // 따라서 catch는 세세한거부터 넓은걸로 잡아가기!

            System.out.println("[네트워크 오류] 메세지: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지: " + e.getMessage());

        } finally {
            client.disconnect();

        }


    }
}
