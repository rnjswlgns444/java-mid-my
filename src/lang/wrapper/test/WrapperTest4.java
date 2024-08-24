package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        Integer i1 = Integer.valueOf(str); /*이건 완전 다른 타입간의 변환이기 때문에
                                              오토박싱/언박싱이 안됨. */


        int i2 = i1;

        Integer i3 = i2;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
