package enumeration.ref3;


public class ClassGradeRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        //Grade 안에 할인율 계산이 다 들어 있으니까 굳이 dicountService 객체를 생성 할 필요가 없음.

        //밑에 프린트부분과 합쳐서 중복 제거.
        //int basic = Grade.BASIC.discount(price);
        //int gold = Grade.GOLD.discount(price);
        //int diamond = Grade.DIAMOND.discount(price);

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);

        //결국 이렇게 되면 DiscountSevice 객체는 필요가 없음. - 없어도 됨!(학습을 위해 남겨놓은 것.)
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인 금액" + grade.discount(price));

    }
}
