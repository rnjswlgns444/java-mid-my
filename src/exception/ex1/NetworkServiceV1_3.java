package exception.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        //결과가 성공이 아니다 = 오류다.
        //if (!connectResult.equals("success")) - 성공이 아니다.

        // "오류다" 라는 것이 더 이해하기 쉬움으로 바꿔줌
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);

            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}