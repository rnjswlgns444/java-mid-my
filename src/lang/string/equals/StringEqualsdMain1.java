package lang.string.equals;

public class StringEqualsdMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교" + (str1 == str2)); //x001 == x002? -> false.
        System.out.println("new String() equals 비교" + (str1.equals(str2))); //String에서 제공하는 클래스.
                                                                            // 진짜 같은 문자인지를 비교하는 클래스
        //다른 결과값.
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교" + (str3 == str4));
        //ture가 나오는 이유: 문자열 풀때문. 문자열풀 때문에 같은 참조값을 가지게 됨.
        //문자열풀 이란? 자바에서 같은 문자를 생성하지 않기 위해 만든 공간임
        //cf)풀(pool)이란? 자원이 모여있는 곳을 의미.
        System.out.println("리터럴 equals 비교" + (str3.equals(str4)));

    }
}
