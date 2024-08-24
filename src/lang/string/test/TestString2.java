package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for(String str : arr) {
            int i = arr.length;
            sum += i;
        }
        System.out.println("문자열 길이의 합: " + sum);
    }
}
