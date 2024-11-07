package enumeration.ref2;

//import static  enumeration.ex3.Grade.*; //static import를 통해 편리하게 사용 가능

public class DiscountService {

    public int discount(Grade grade, int price) {

        return price * grade.getDiscountPercent() / 100;
    }
}
