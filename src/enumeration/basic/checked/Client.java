package enumeration.basic.checked;

public class Client  {

    public void call() throws MycheckedException { //throws 예외를 밖으로 던짐.

        throw new MycheckedException("ex"); // 예외 발생 시킴
    }
}
