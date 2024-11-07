package enumeration.ref3;

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

    //추가 - 할인율을 굳이 따로 빼서 계산할 이유가 없음.
    // discountPercent를 DiscountService로 굳이 빼서 쓰지 않고 여기 안에서 쓰도록.
    public int discount(int price) {

        return price * discountPercent / 100;

    }
}
