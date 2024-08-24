package enumeration.ex1;

public class StringGradeEx1_1 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.basic, price);
        int gold = discountService.discount(StringGrade.gold, price);
        int diamond = discountService.discount(StringGrade.diamond, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }




}
