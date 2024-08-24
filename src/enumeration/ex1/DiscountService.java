package enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price) {

        int discountPrice = 0;
        if (grade.equals(StringGrade.basic)) {
            discountPrice = 10;
        } else if (grade.equals(StringGrade.gold)) {
             discountPrice = 20;
        } else if (grade.equals(StringGrade.diamond)) {
             discountPrice = 30;
        } else {
            System.out.println(grade + "할인X");

        }
        return price * discountPrice / 100;
    }
}
