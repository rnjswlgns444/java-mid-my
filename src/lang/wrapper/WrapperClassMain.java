package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        /* 빨간 밑줄 뜨는 이유:
        * Integer 들어가면 @Deprecated(미래에 삭제될 예정) 때문에 뜨는 것
        * Deprecated를 보면 대체 할 것들을 알려주기 때문에 그걸로 바꿔서 쓰면 됨.
        */
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);

        System.out.println("newInteger = " + newInteger);
        System.out.println(longObj);
    }
}
