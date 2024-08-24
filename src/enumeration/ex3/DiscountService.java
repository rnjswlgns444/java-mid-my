package enumeration.ex3;

//import static  enumeration.ex3.Grade.*; //static import를 통해 편리하게 사용 가능

public class DiscountService {

    int discountPercent = 0;

    public int discount(Grade classGrade, int price) {

        if (classGrade == Grade.BASIC) { //static import를 쓰면 그냥 BASIC이라고 쓸 수 있음.
            discountPercent = 10;
        } else if (classGrade == Grade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}