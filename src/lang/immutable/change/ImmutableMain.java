package lang.immutable.change;

public class ImmutableMain {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());  //30이 나온다고 생각하면 공부 처음부터 다시하셈;;

        //★불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만드어거 반환하기 때문에 꼭! 반환 값을 받아야 한다.
        //위의 결과가 반환값을 받지 않았기 때문에 일어난 상황.ㅇ
    }
}
