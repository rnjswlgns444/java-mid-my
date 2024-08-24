package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {

        int discountPrice = 0;
        if (grade == "basic") {
            discountPrice = 10;
        } else if (grade == "gold") {
             discountPrice = 20;
        } else if (grade == "diamond") {
             discountPrice = 30;
        } else {
            System.out.println(grade + "할인X");

        }
        return price * discountPrice / 100;
    }
}
