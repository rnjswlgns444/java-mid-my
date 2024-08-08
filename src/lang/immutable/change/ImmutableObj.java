package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    //내가 생각한 결론: 결국 불변객체를 바꾸려면 "새로운 객체"를 만들어서 반환한다고 생각하기!
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
