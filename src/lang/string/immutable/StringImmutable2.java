package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat("java");
        System.out.println("str = " + str2); //str은 불변객체임. 따라서 concat을 쓸 때도 새로운 변수로 받아야함.

    }
}
