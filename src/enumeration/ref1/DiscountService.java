package enumeration.ref1;

public class DiscountService {

    int discountPercent = 0;

    public int discount(ClassGrade classGrade, int price) {
        //이미 Grade 클래스 생성 시 할인율이 정해짐.
        //int discountPercent = classGrade.getDiscountPercent(); // 굳이 생성할 필요 X

        return price * classGrade.getDiscountPercent() / 100;
    }
}
