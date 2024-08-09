package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "hello Java!";
        String str2 = "hello java!";
        String str3 = "Hello, World!";

        //String 기능들.
        System.out.println("str equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); //사전적으로 얼마나 떨어져 있는지를 알려줌.
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));
        System.out.println("'a' compareTo 'a': " + "a".compareTo("b"));

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("hello"));
        System.out.println("str1 ends with 'Java!' : " + str1.endsWith("Java!"));
    }
}
