package enumeration.basic.unchecked;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex"); //UncheckedException이기 때문에 throws를 하지 않아도 오류X
    }
}
