package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울"); //a의 참조값이 x001이라고 가정
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다. //x001 참조.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("부산"); //b는 a를 참조 하고 있었기 때문에 b의 참조를 바꾸면 해결할 수 있는 일.
        //결과적으로 a와 b의 참조값이 달라짐.
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}
