package enumeration.basic.checked;

/*
* Exception을 상속받은 예외는 체크 예외가 된다.
* */

public class MycheckedException extends Exception {

    public MycheckedException(String message) {
        super(message); //부모 클래스에 오류가 왜 발생했는지 보관하기.(내가 보관하는 것보다 그냥 부모 클래스에 보관시킴)
    }
}
