package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {  //사실상 다른 클래스라고 보면 됨. 생성하는데도 제약이 없음.
                           // 그저 위 클래스의 private에도 접근이 가능하다는 차이만 있을 뿐
            private int nestedInstanceValue = 1;

            public void print() {

                //자신의 멤버에 접근
                System.out.println(nestedInstanceValue);

                //바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
                // - 애초에 다른 영역에 존재하므로 접근 불가능. 모르겠다면 기본 강의 다시 보고 오기.
                //System.out.println(outInstanceValue);

                //바깥 클래스의 클래스 멤버에는 접근 할 수 있다. private도 접근 가능 - 같은 클래스 안에 존재하기 때문에!
                System.out.println(outClassValue); //NestedOuter.outClassValue라고 적어도 되지만 굳이..?
            }
    }
}
