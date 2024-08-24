package enumeration.ex3;

public class EumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));


    }
    //eum을 사용하면 toString이 적용되서 참조값 반환을 직접하기 위해서 메서드를 만듦.
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade)); //참조값 반환
    }
}
