package enumeration.ref2;

public enum Grade {

    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) { //애초에 열거형은 상수로 지정하는 것 외에 생성 불가능
                                 //따라서 private 안적어도 상관 X
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
