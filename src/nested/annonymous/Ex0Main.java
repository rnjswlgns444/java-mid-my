package nested.annonymous;

import java.beans.JavaBean;

public class Ex0Main {

/*    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 종료");
    }

    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }*/

    public static void hello(String str) {
        System.out.println("프로그램 시작");
        System.out.println("Hello" + str);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");

    }
}
