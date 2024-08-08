package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025); //새로운 객체를 반환!
        //주의! 불변객체를 변환하는 객체이므로 반드시 새로운 값을 받아줄 객체가 필요하다.(실제로 안 받아서 실수함..)
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
