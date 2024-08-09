package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hell0";
        String str4 = "hell0";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4 ));
    }
//        문자열 비교를 항상 equals로 해야하는 이유:
//        매개변수가 new로 들어올지, 리터럴로 들어올지 모르기 때문에 equals로 받아야함!
        private static boolean isSame(String x, String y) {
            return x == y;
        }
}
