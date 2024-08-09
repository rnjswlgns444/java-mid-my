package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        System.out.println("str = " + str); //str은 불변객체임. 따라서 concat을 쓸 때도 새로운 변수로 받아야함.

    }
}
