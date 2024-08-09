package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a + b; /*본래 참조값끼리의 연산은 불가능!!
                                  근데  string은 너무 많이 쓰기 때문에 자바에서 특별히 가능하게 만듦.*/

        System.out.println(result1);
        System.out.println(result2);

    }
}

