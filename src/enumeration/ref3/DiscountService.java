package enumeration.ref3;

//import static  enumeration.ex3.Grade.*; //static import를 통해 편리하게 사용 가능

public class DiscountService {

    public int discount(Grade grade, int price) {

        return grade.discount(price);
    }
}
