package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //CompareTo 캡술화
    public int CompareTo(int target) {
        if (value > target) {
            return 1;
        } else if (value == target) {
            return 0;
        } else {
            return -1;
        }
    }
    //왜 Override일까? => toString은 자바가 기본적으로 제공하는 메서드에 포함
    //그렇기 때문에 Override하는게 당연함!
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
