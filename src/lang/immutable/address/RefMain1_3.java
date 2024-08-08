package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울"); //a의 참조값이 x001이라고 가정
        Address b = a; //b에는 a의 참조값(주소값)이 들어감. - 즉 b = x001;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(a,"부산");
        System.out.println("부산 -> a");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
