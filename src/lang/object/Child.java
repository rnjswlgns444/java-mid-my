package lang.object;

public class Child extends Parent{ //명시적으로 상속을 받았기 때문에 object는 상속되지 않음!
                                   //결국 부모 클래스로 가면 Object를 상속받기 때문!

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
